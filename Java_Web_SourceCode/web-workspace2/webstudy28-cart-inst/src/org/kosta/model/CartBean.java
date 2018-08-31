package org.kosta.model;

import java.util.ArrayList;

/**
 * 쇼핑카트 객체 
 * 쇼핑카트에 담을 상품 정보를 저장 : itemList 
 * 쇼핑카트에서 필요한 비즈니스를 구현 
 * -> 쇼핑카트에 상품을 추가 
 * -> 쇼핑카트에 중복 상품 체크 
 * -> 쇼핑카트에서 상품 삭제 
 * -> 카트에 담긴 상품의 총액 
 * @author KOSTA
 *
 */
public class CartBean {
	private ArrayList<ItemDTO> itemList=new ArrayList<ItemDTO>();
	public ArrayList<ItemDTO> getItemList(){
		return itemList;
	}
	/**
	 * 전달된 no와 쇼핑카트 요소의 상품번호가 일치하면
	 * 해당 인덱스를 반환하는 메서드
	 * 만약 일치되는 요소가 없다면 -1  
	 * @param no
	 * @return
	 */
	public int findIndexByNo(String no){
		int index=-1;
		for(int i=0;i<itemList.size();i++){
			if(no.equals(itemList.get(i).getItemNo())){
				index=i;
				break;
			}
		}
		return index;
	}
	/**
	 * 쇼핑카트에 상품을 추가 
	 * checkItemNo 메서드를 이용해 중복을 확인
	 * 중복되면 DuplicateItemException 을 발생 및 throws 
	 * @param dto
	 */
	public void addItem(ItemDTO dto) 
			throws DuplicateItemException{
		if(findIndexByNo(dto.getItemNo())!=-1){
			throw new DuplicateItemException();
		}
		itemList.add(dto);
	}
	/**
	 * 쇼핑 카트에서 넘어온 상품번호와 일치되는 
	 * 상품이 존재하면 카트에서 삭제
	 * @param no
	 */
	public void removeItem(String no){
		int index=findIndexByNo(no);
		itemList.remove(index);
	}
	/**
	 * 상품 총액을 반환 
	 * @return
	 */
	public int getTotalPrice(){
		int total=0;
		for(int i=0;i<itemList.size();i++){
			total+=itemList.get(i).getPrice();
		}
		return total;
	}
}
