<?php
    require 'app/functions.php';
    $app = new Functions(); 
    $valid = $app->init();
?>

<!doctype html>

<html lang="en">
<head>
  <meta charset="utf-8">

  <title>Blog</title>
  <meta name="description" content="Blog with authentification">
  <meta name="author" content="Mārcis Koloda">

  
    <!-- CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.css">
  <link rel="stylesheet" href="/css/main.css">

</head>
<body>


    <div class="ui top fixed menu">
        <div class="item">
            <img src="/img/logo.png">
        </div>
        <a href="/" class="item">Articles</a>
        <a href="newarticle.php" class="item">Add new article</a>
        <?php if(!$valid){ ?>
            <a href="register.php" class="item">Register</a>
        <?php } ?>
        
        <div class="right menu">
            <?php if($valid){ ?>
                <a class="item"><?php echo $_SESSION['full-name']; ?></a>
                <a href="logout.php" class="item">Sign-out</a>
            <?php }else{ ?>
                <a href="login.php" class="item">Sign-in</a>
            <?php } ?>
        </div>
    </div>