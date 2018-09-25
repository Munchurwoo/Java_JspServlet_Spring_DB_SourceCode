package org.kosta.springmvc13.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.kosta.springmvc13.model.service.BoardService;
import org.kosta.springmvc13.model.vo.MemberVO;
import org.kosta.springmvc13.model.vo.PostVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BoardController{
	@Resource(name="boardServiceImpl")
	private BoardService boardService;
	@RequestMapping("writeForm.do")
	public String writeForm(){
		return "board/write";
	}	
	/** 
	 * 게시글을 insert 
	 * 새로고침시 재입력을 막기 위해 redirect 시킨다. 
	 * post 방식일때만 등록가능
	 * 회원정보를 세션에서 반환받아 BoardVO에 할당한다 
	 */
	@PostMapping("write.do")	
	public String write(HttpSession session,PostVO postVO,RedirectAttributes redirectAttributes) {
		MemberVO mvo=(MemberVO) session.getAttribute("mvo");
		if(mvo!=null){
			postVO.setMemberVO(mvo);
		}			
		boardService.write(postVO);
		redirectAttributes.addAttribute("no", +postVO.getNo());
		return "redirect:post-detail-no-hits.do";
	}	
	/**
	 * 최근 게시물 5개를 보여주는 메서드
	 * @param request
	 * @param response
	 * @return
	 * @
	 */
	@RequestMapping("list.do")
	public ModelAndView list(String pageNo) {	
		return new ModelAndView("board/list","lvo",boardService.getPostList(pageNo));
	}
	/**
	 * 게시글 조회 , 조회수 업데이트
	 * 개별 게시물 보여준다. 	
	 * @param request
	 * @param response
	 * @return
	 * @
	 */
	@RequestMapping("post-detail.do")
	public String postDetail(int no,RedirectAttributes redirectAttributes,HttpSession session) {	
		@SuppressWarnings("unchecked")
		ArrayList<Integer> noList=(ArrayList<Integer>) session.getAttribute("noList");
		//noList에 게시글번호가 존재하지 않으면 조회수를 증가시킨다. 
		if(noList.contains(no)==false) {
			boardService.updateHits(no);	
			noList.add(no);
		}		
		redirectAttributes.addAttribute("no", no);
		return "redirect:post-detail-no-hits.do";
	}
	/**
	 * 등록, 수정시 사용하는 개별 게시물 조회 메서드 
	 * @param no
	 * @return
	 * @
	 */
	@RequestMapping("post-detail-no-hits.do")
	public ModelAndView postDetailNoHits(int no) {			
		return new ModelAndView("board/post_detail","pvo",boardService.getPostDetailNoHits(no));
	}	
	
	@RequestMapping("deletePost.do")
	public ModelAndView deletePost(int no) {		
		boardService.deletePost(no);		
		return new ModelAndView("board/list","lvo",boardService.getPostList());
	}
	@RequestMapping("updateView.do")
	public ModelAndView updateView(int no) {
		return new ModelAndView("board/update","pvo"
				,boardService.getPostDetailNoHits(no));
	}
	@RequestMapping("updatePost.do")
	public ModelAndView updatePost(PostVO pvo) {
		boardService.updatePost(pvo);
		return new ModelAndView("board/post_detail","pvo",boardService.getPostDetailNoHits(pvo.getNo()));
	}
	
}






















