$('#carousel-testimonials').owlCarousel({
    margin: 10,
    loop: true,
    autoWidth: true,
    autoplay: true,
    autoplayTimeout: 4000,
    items: 2,
});

var owl = $("#carousel-header").owlCarousel({
    animateOut: 'fadeOut',
    animateIn: 'fadeIn',
    loop: true,
    touchDrag: false,
    autoplay: true,
    autoplayTimeout: 5000,
    autoplayHoverPause: false,
    dots: false,
    //smartSpeed:5000,
    items: 1,
});

//https://owlcarousel2.github.io/OwlCarousel2/docs/api-events.html
owl.on('changed.owl.carousel', function(e) {
    var current = e.item.index + 1;
    var total = e.item.count;
    //console.info(e.item.index,current, total, "total");
    if (current === total) {
        $("#carousel-header").removeClass("element-animated-zoom");
        setTimeout(function() {
            $("#carousel-header").addClass("element-animated-zoom");
        }, 100);
    }
});

//Sub Paginas

$("#subPage-carousel").owlCarousel({
    items:3,
    loop:true,
    //margin:10,
    center: true,
    autoplay:false,
    autoplayTimeout:3000,
    autoplayHoverPause:true,
    responsiveClass:true,
    responsive:{
        0:{
            items:1,
            nav:false,
            autoplay:true,
        },
        600:{
            items:3,
            autoplay:true,
        },
        1000:{
            items:3,
            nav:false,
            autoplay:true,
        }
    }
    /*margin: 10,
    loop: true,
    autoWidth: true,
    autoplay: false,
    autoplayTimeout: 4000,
    items: 2,*/


});
