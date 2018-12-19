<?php 
    require 'app/template/head.php'; 

?>

<div class="ui container segment main">
    <header>
        <h2>Log in</h2>
    </header>
    <div class="ui divider"></div>

    <form class="ui form" action="auth.php" method="post">
        <div class="field">
            <label>Username</label>
            <input type="text" name="username" placeholder="Username" requied>
        </div>
        <div class="field">
            <label>Password</label>
            <input type="password" name="password" placeholder="Password" required>
        </div>

        <button class="ui button" type="submit">Sign-in</button>
    </form>
</div>



<?php include 'app/template/foot.php'; ?>