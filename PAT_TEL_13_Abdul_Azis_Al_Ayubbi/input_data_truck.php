<?php 
include 'koneksi.php';
$jumlahTruk = $_POST['jumlah_truk'];
$jumlahBerasTruk = $_POST['jumlah_beras_truk'];
$jumlahPersediaanBeras = $_POST['persediaan_beras'];
$total = $_POST['total'];
$query = mysqli_query($koneksi,"INSERT INTO gudangg VALUES('','$jumlahTruk','$jumlahBerasTruk','$jumlahPersediaanBeras','$total')");
if($query){
echo "<script>

alert('Data Berhasil Dimasukkan ')
location.href='database_truck.php'

</script>";
}
else{
    echo "<script>

alert('Data tidak berhasil Dimasukkan ')
location.href='index.html'

</script>";
}



?>