<?php 
    require 'app/template/head.php'; 

    $app->autorized();
?>

<div class="ui container segment main">
    <header>
        <h2>Write new article</h2>
    </header>
    <div class="ui divider"></div>

    <form class="ui form" action="addarticle.php" method="post">
        <div class="field">
            <label>Title</label>
            <input type="text" name="title" placeholder="Ttitle ..." requied>
        </div>
        <div class="field">
            <label>Content</label>
            <textarea name="content" placeholder="Content of the article"></textarea>
        </div>

        <button class="ui button" type="submit">Save</button>
    </form>
</div>



<?php include 'app/template/foot.php'; ?>