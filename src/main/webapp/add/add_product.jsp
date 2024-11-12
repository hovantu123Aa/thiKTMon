<%-- 
    Document   : add_product
    Created on : Nov 12, 2024, 1:43:48 PM
    Author     : ADMIN
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="../shared/header.jsp" />

<jsp:include page="../shared/nav.jsp" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    
    <h2>Thêm sản phẩm (Giày)</h2>    
    <form method="post" enctype="multipart/form-data">
        <div class="mb-2">
            <label>Tên hoa</label>
            <input type="text" name="tenhoa" value="" required="" class="form-control" />
        </div>
        <div class="mb-2">
            <label>Giá</label>
            <input type="number" name="gia" value="" required="" class="form-control" />
        </div>
        <div class="mb-2">
            <label>Hình ảnh</label>
            <input type="file" name="hinh" value="" required="" class="form-control" />
        </div>
         <div class="mb-2">
            <label>Thể loại</label>
            <select name="maloai" class="form-control" required="">      
                <option value="" disabled="">==Chọn thể loại==</option>
                <%
                   
                    {
                %>
                
                <%
                    }
                %>
            </select>
        </div>        
        <button type="submit" class="btn btn-primary">Save</button>
    </form>       
</div>

<jsp:include page="../shared/footer.jsp" />
