$( document ).ready(function() {
    console.log( "ready!" );

    $('.message .close').on('click', function() {
    $(this)
      .closest('.message')
      .transition('fade');
  });


});