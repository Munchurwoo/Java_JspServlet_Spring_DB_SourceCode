<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row">
<div class="col-sm-4"></div>
<div class="col-sm-6">
<form method="post" action="front">
	<input type="hidden" name="command" value="RegisterItem">
	<table class="table table-bordered">
		<tr>
			<td>name</td>
			<td><input type=text name=name required="required"></td>
		</tr>
		<tr>
			<td>maker</td>
			<td><input type=text name=maker required="required"></td>
		</tr>
		<tr>
			<td>price</td>
			<td><input type=text name=price required="required"></td>
		</tr>
		<tr>
			<td>detail</td>
			<td><textarea rows="5" cols="30" name=detail required="required"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="상품등록"></td>
		</tr>
	</table>
</form>
</div>
<div class="col-sm-2"></div>
</div>