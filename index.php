<?php 
    require 'app/template/head.php'; 
?>


<div class="ui container segment main">
    <header>
        <h2>Newest articles</h2>
    </header>
    <div class="ui divider"></div>

        <?php 
            $posts = $app->getPosts();

            foreach ($posts as $post) {
                ?>
                    <div class="ui fluid container">
                        <a href="/read.php?id=<?php echo $post->ID; ?>" class="ui small header"><?php echo $post->title; ?></a>
                        <p class="limited"><?php echo $post->content; ?></p>
                    </div>
                    <div class="ui divider"></div>
                <?php 
            }
        ?>
</div>



<?php include 'app/template/foot.php'; ?>