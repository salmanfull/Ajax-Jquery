<!DOCTYPE html>
<html>
    <head>
        <title>Search</title>
        <script src="jquery-3.2.0.min.js"></script>
        <script>
            $(document).ready(function() {
               
               $("#requestForm").submit(function(e) {
                   e.preventDefault();
               });
               
                $("#button").click(function(e) {
                    dataString = $("#requestForm").serialize();
                    $.ajax({
                        type : "POST",
                        url : "internInfo",
                        data : dataString,
                        dataType : "json",
                        success : function(data) {
                            if(data.success) {
                                $("#response").html('');
                                $("#response").append("<b>ID:</b> "+ data.internDetails.id + "<br>");
                                $("#response").append("<b>Name:</b> "+ data.internDetails.name + "<br>");
                                $("#response").append("<b>Age:</b> "+ data.internDetails.age + "<br>");
                                $("#response").append("<b>Team:</b> "+ data.internDetails.team + "<br>");
                            } else {
                                $("#response").html("Invalid Intern ID...")
                            }
                        }
                    })
                });
            });
        </script>
    </head>
    <body>
        <form id="requestForm">
            <fieldset>
                <legend> Intern Search Form </legend>
                <p>
                    <label for="internID">Intern ID:</label><br>
                    <input id="internID" type="number" name="id">
                </p>
                <p>
                    <input id="button" type="button" value="Submit">
                </p>
            </fieldset>
        </form>
        <div id="anotherSection">
            <fieldset>
                <legend> Response From Database </legend>
                <div id="response"></div>
            </fieldset>
        </div>
    </body>
</html>