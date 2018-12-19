<?php 
    require 'app/template/head.php'; 

?>

<div class="ui negative message transition main">
  <i class="close icon"></i>
  <div class="header">
    There was an error:
  </div>
  <p>Required fields must be filled</p>
</div>

<div class="ui container segment main">
    <header>
        <h2>Create an account..</h2>
    </header>
    <div class="ui divider"></div>

    <form class="ui form" action="createaccount.php" method="post">
        <div class="field">
            <label>First Name</label>
            <input type="text" name="first-name" placeholder="First Name" required>
        </div>
        <div class="field">
            <label>Last Name</label>
            <input type="text" name="last-name" placeholder="Last Name">
        </div>
        <div class="field">
            <label>Email</label>
            <input type="email" name="email" placeholder="Email" required>
        </div>
        <div class="field">
            <label>Username</label>
            <input type="text" name="username" placeholder="Username" requied>
        </div>
        <div class="field">
            <label>Password</label>
            <input type="password" name="password" placeholder="Password" required>
        </div>
        <div class="field">
            <label>Password, again</label>
            <input type="password" name="password-again" placeholder="Password, again" required>
        </div>
        <div class="field">
            <div class="ui checkbox">
            <input type="checkbox" name="terms" tabindex="0" class="hidden">
            <label>I agree to the Terms and Conditions</label>
            </div>
        </div>
        <button class="ui button" type="submit">Register</button>
    </form>
</div>



<?php include 'app/template/foot.php'; ?>