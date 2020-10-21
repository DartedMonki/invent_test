<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "testonline";

$db = mysqli_connect($servername, $username, $password, $dbname);

$sql = "CREATE TABLE IF NOT EXISTS produk(id INT(10) NOT NULL AUTO_INCREMENT,
nama_barang VARCHAR(200) NOT NULL,
kode_barang VARCHAR(50) NOT NULL,
jumlah_barang INT(10) NOT NULL,
tanggal DATE NOT NULL,
PRIMARY KEY(id)
)";

$result = mysqli_query($db, $sql) or die("Error Create: $sql");

$insert = "INSERT INTO produk(id,nama_barang,kode_barang,jumlah_barang,tanggal) 
VALUES
    (1,'kopiko','001',1,'2020-02-01'),
    (2,'kopiko','001',4,'2020-02-02'),
    (3,'mentos','002',3,'2020-02-01'),
    (4,'mentos','002',7,'2020-02-05'),
    (5,'relaxa','003',7,'2020-02-01'),
    (6,'relaxa','003',2,'2020-02-02')
";

$insertresult = mysqli_query($db, $insert) or die("Error Insert: $insert");

?>