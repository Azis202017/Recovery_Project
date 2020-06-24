<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Database Truk</title>
    <link rel="stylesheet" href="database.css">
</head>
<body>
<?php
    include 'koneksi.php';
    
    $query  = "SELECT * FROM gudangg";
    $result = mysqli_query($koneksi, $query);
    if($result):
?>    
<h4>DATA TRUK YANG DIINPUT</h4>
    <table border="1" style="margin-left:200px;">
        <tr>
            <th>No</th>
            <th>Jumlah truk yang mengangkut beras : </th>
            <th>Jumlah beras yang diangkut truk : </th>
            <th>Persediaan beras sisa yang masih ada digudang : </th>
            <th>Total beras yang ada : </th>
            
        </tr>
        <?php while($row = mysqli_fetch_row($result)):?>
            <tr>
                <?php 
                $no = $row[0];
                $jumlahTrukYangMengangkutBeras = $row[1];
                $jumlahBerasYangDiangkutTruk = $row[2];
                $persediaanBerasSisaYangAdaDigudang = $row[3];
                $totalBerasYangAda = $row[4];
                
                ?>
                <td><?= $no?></td>
                <td>
                   <?= $jumlahTrukYangMengangkutBeras?>
                 
                </td>
              
                <td><?=$jumlahBerasYangDiangkutTruk;?></td>
                <td><?=$persediaanBerasSisaYangAdaDigudang;?></td>
                <td><?=$totalBerasYangAda;?></td>
            
            </tr>
        <?php endwhile;?>
    </table>

<?php endif;?>
    
</body>
</html>