<?php 

class Connect { 

    public $pdo;

    
    public function connect() { 

        $options = [
            PDO::ATTR_EMULATE_PREPARES => false,
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
            PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_OBJ]; 
            

        $pdos = new PDO('mysql:HOST=localhost;dbname=ardit;charset=utf8','db_user','VOi7HtlbBKN5Cww3',$options);

        $this->pdo = $pdos;
    } 
}


?>
