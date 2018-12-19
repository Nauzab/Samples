<?php 
    require 'app/template/head.php'; 

    $post = $app->getPost($_GET['id']);
?>


<div class="ui container segment main">
    <header>
        <h2><?php echo $post->title; ?></h2>
    </header>
    <div class="ui divider"></div>
    <div class="ui container">
        <p><?php echo nl2br($post->content); ?></p>
    </div>
    <div class="ui divider"></div>
    <footer class="ui celled horizontal list">
        <div class="item">Posted: <?php echo $post->posted; ?></div>
        <div class="item">Author: </div>
    </footer>
</div>

<?php include 'app/template/foot.php'; ?>