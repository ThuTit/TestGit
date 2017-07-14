<?php
    $host="localhost";
    $user="root";
    $pass="rootroot";
    $db="thuctap1";
    $conn= mysql_connect($host, $user, $pass) or die("Loi ket noi");
    mysql_select_db($db,$conn) or die("Loi chon CSDL");
    $i=$_GET['id'];
    $sql="select * from user where id='".$i."'";
    $result=mysql_query($sql);
    $json=array();
    while($row=mysql_fetch_array($result)){
        $infor=array();
        $infor["id"]=$row["id"];
        $infor["user_name"]=$row["user_name"];
        $infor["first_name"]=$row["first_name"];
        $infor["last_name"]=$row["last_name"];
        $infor["email"]=$row["email"];
        $infor["address"]=$row["address"];
        $infor["password"]=$row["password"];
        $infor["avatar"]=$row["avatar"];
        
        array_push($json, $infor);
        
    }
    echo json_encode($json[0]);
    ?>

