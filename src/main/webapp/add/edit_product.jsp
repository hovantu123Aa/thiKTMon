<%-- 
    Document   : edit_product
    Created on : Nov 12, 2024, 1:47:09 PM
    Author     : ADMIN
--%>

<%@page import="model.Loai"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Giay"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="../shared/header.jsp" />

<jsp:include page="../shared/nav.jsp" />
<div class="container">
    <% 
        Hoa hoa=(Hoa)request.getAttribute("hoa");
        ArrayList<Loai>dsLoai=(ArrayList<Loai>)request.getAttribute("dsLoai");
    %>
    
    <h2>Cập nhật sản phẩm (Giày)</h2>    
    <form method="post" enctype="multipart/form-data">
        <div class="mb-2">
            <label>Tên Giày</label>
            <input type="text" name="tenhoa" value="<%=hoa.getTenhoa()%>" class="form-control" required="" />
        </div>
        <div class="mb-2">
            <label>Đơn Giá</label>
            <input type="number" name="gia" value="<%=hoa.getGia()%>" class="form-control" required="" />
        </div>
        <div class="mb-2">
            <label>Hình</label>
            <input type="file" name="hinh" value="" class="form-control" />
            <img src="assets/images/products/<%=hoa.getHinh()%>" width="150px"/>
            <input type="hidden" name="oldImg" value="<%=hoa.getHinh()%>">
        </div>
         <div class="mb-2">
            <label>Mã Loại</label>
            <select name="maloai" class="form-control">      
                <option value="" disabled="">==Chọn thể loại==</option>
                <%
                    for(Loai loai:dsLoai){
                %>
                <option value="<%=loai.getMaloai()%>"<%=hoa.getMaloai()==loai.getMaloai()?"selected":""%>><%=loai.getTenloai()%></option>
                <%
                    }
                %>
            </select>
        </div>        
        <button type="submit" class="btn btn-primary">Save</button>
    </form>       
</div>

<jsp:include page="../shared/footer.jsp" />
