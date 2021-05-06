<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Modern Business - Start Bootstrap Template</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js"
	crossorigin="anonymous"></script>
<!-- Core theme CSS (includes Bootstrap)-->
<link href="<c:url value='/resources/css/styles.css'/>" rel="stylesheet" />
</head>
<body>

	<%@ include file="/WEB-INF/views/common/nav.jsp"%>
<!-- Page Content-->
        <section class="py-5">
            <div class="container">
                <!-- Page Heading/Breadcrumbs-->
                <h1>
                    Board
                    <small>detail</small>
                </h1>
                <!-- Content Row-->
                <!-- Contact Form-->
                <!-- In order to set the email address and subject line for the contact form go to the assets/mail/contact_me.php file.-->
                <div class="row">
                    <div class="col-lg-8 mb-4">
                        <form id="contactForm" name="sentMessage" novalidate>
                            <div class="control-group form-group">
                                <div class="controls">
                                    <label>no:</label>
                                    <input class="form-control" id="name" type="text" value="${detail.no}" required data-validation-required-message="Please enter your name." />
                                    <p class="help-block"></p>
                                </div>
                            </div>
                            <div class="control-group form-group">
                                <div class="controls">
                                    <label>id:</label>
                                    <input class="form-control" id="phone" type="tel"  value="${detail.id}" required data-validation-required-message="Please enter your phone number." />
                                </div>
                            </div>
                            <div class="control-group form-group">
                                <div class="controls">
                                    <label>title:</label>
                                    <input class="form-control" id="email" type="email"  value="${detail.title}" required data-validation-required-message="Please enter your email address." />
                                </div>
                            </div>
                            <div class="control-group form-group">
                                <div class="controls">
                                    <label>content:</label>
                                    <textarea class="form-control" id="message" rows="10" cols="100" required data-validation-required-message="Please enter your message" maxlength="999" style="resize: none">${detail.content}</textarea>
                                </div>
                            </div>
                            <div id="success"></div>
                            <!-- For success/fail messages-->
                            <button class="btn btn-primary" id="sendMessageButton" type="submit">Send Message</button>
                        </form>
                    </div>
                </div>
            </div>
        </section>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>

	<!-- Bootstrap core JS-->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="<c:url value='/resources/js/scripts.js'/>"></script>
</body>

<script>
function fn_btn(no){
	var  formData= $('#boardForm').serialize();
    $.ajax({
        cache : false,
        url : "${pageContext.request.contextPath}/boardDetail.do",
        type : 'POST', 
        data : formData, 
        success : function(data) {
            alert('f');
        }, // success 

        error : function(xhr, status) {
            alert(xhr + " : " + status);
        }
    }); // $.ajax */

}
</script>

</html>

