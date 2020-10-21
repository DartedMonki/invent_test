<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "testonline";

$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT kode_barang, SUM(jumlah_barang) AS jumlah_barang, MAX(tanggal) AS tanggal FROM produk GROUP BY kode_barang";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
  while($row = $result->fetch_assoc()) {
    echo "kode_barang = " . $row["kode_barang"]. ", jumlah_barang = " . $row["jumlah_barang"]. ", tanggal = " . $row["tanggal"]. "<br>";
  }
} else {
  echo "0 results";
}

$conn->close();
?>