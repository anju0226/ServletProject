<%--
  Created by IntelliJ IDEA.
  User: Anju
  Date: 26/06/2016
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>

</head>
<body>

    <legend>Menu</legend>


    <section class="menu-panel">
        <h2>Brunch</h2>
        <p class="adorn-brdr-btm menu-time"></p>

        <h3>Featured Items</h3>
        <p class="intro"></p>

        <form action="/order" method="post">
            <fieldset>

                MOMO: <button type="button" onclick="increaseMomo();">+</button>
                <button type="button" onclick="decreaseMomo();">-</button>
                <input type="number" id="Momo" name="momo" style="width: 2%; height: 5%" value="0"/><br>

                CHOWMIN:<button type="button" onclick="increaseChowmin();">+</button></a>
                <button type="button" onclick="decreaseChowmin();">-</button>
                <input id="Chowmin" name="chowmin" style="width: 2%; height: 5%" value="0"/><br>

                FRIED RICE:<button type="button" onclick="increaseFried();">+</button></a>
                <button type="button" onclick="decreaseFried();">-</button>
                <input id="friedRice" name="friedRice" style="width: 2%; height: 5%" value="0"/><br>


                <input type="submit"  id="order" value="order"><br>

                <a href="/Menu.jsp">Generate Report</a>


            </fieldset>


        </form>
        </section>

    <script type="text/javascript">
        function increaseMomo() {

            var momo = document.getElementById("Momo").value;
            var momo_count = parseInt(momo);
            momo_count++;
            document.getElementById("Momo").value = momo_count;//assigning value to the momo
           // alert(momo_count);

        }

        function increaseChowmin() {

            var chowmin = document.getElementById("Chowmin").value;
            var chowmin_count = parseInt(chowmin);
            chowmin_count++;
            document.getElementById("Chowmin").value = chowmin_count;//assigning value to the momo

        }

        function increaseFried(){

            var fried = document.getElementById("friedRice").value;
            var fried_count = parseInt(fried);
            fried_count++;
            document.getElementById("friedRice").value = fried_count;

        }

        function decreaseMomo() {

            var momo = document.getElementById("Momo").value;
            var momo_count = parseInt(momo);
            momo_count--;
            document.getElementById("Momo").value = momo_count;

        }

        function decreaseChowmin() {
            var chowmin = document.getElementById("Chowmin").value;
            var chowmin_count = parseInt(chowmin);
            chowmin_count--;
            document.getElementById("Chowmin").value = chowmin_count;

        }

        function decreaseFried(){
            var fried = document.getElementById("friedRice").value;
            var fried_count = parseInt(fried);
            fried_count--;
            document.getElementById("friedRice").value = fried_count;


        }

        function save(){


        }
    </script>

</body>
</html>
