// v:10.2.6
var skim_toolbar = true;
var skim_toolbar = true;
var skimlinks_pub_id = window.skimlinks_pub_id || '33004X991422';
var noskim_domains = window.noskim_domains || new Array("google.","yahoo.","bing.com","search.aol.com");
var skimwords_horizontal_distance = window.skimwords_horizontal_distance || 80; 
var skimwords_vertical_distance = window.skimwords_vertical_distance || 80; 
var link_tooltip = window.link_tooltip || ''; 
var noskimproducts = window.noskimproducts || false;  
var noskoupon = window.noskoupon || true; 
var skimwords_instant = window.skimwords_instant || true; 
var skimwords_hover_name = window.skimwords_hover_name || 'neutral';
var noskimlinks = window.noskimlinks || false;
var link_icon = window.link_icon || 'http://s.skimresources.com/img/cbuddy2.png'; 
var	skimwords_flyover_template = "" +
	"<div id='flyover2-{{id}}' class='flyover2-outer {{multiclass}}'>" +
		"<div class='flyover2-body'>" +
		"</div>" +
		"<div class='flyover2-bottom'>" +
			"<div class='flyover2-branding'>Provided By CouponBuddy</div>" + 
			"<a class='bottom-link-2' title='{{hover_title}}'></a>" + 
		"</div>"+
	"</div>";

(function(){

	var exclusionApiUrl = "http://e.skimresources.com",
		includeUrl = window['force_toolbar_js'] || "http://s.skimresources.com/toolbar/tb.sim.min.js",
		current_url = window['force_location'] || window.location,
		noskim_domains = window['noskim_domains'] || new Array(),
		current_location = window.location.href || '',
		shouldrun = 1;
	
	function getScript(src){
		var skimlinks_script = document.createElement('script');
		
		skimlinks_script.type = 'text/javascript';
		skimlinks_script.async = true;
		skimlinks_script.src = src;

		var skimlinks_script_attach = document.getElementsByTagName('script')[0];
		skimlinks_script_attach.parentNode.insertBefore(skimlinks_script, skimlinks_script_attach.nextSibling);		
	}
	
	function insertSkimlinks(){
		getScript(includeUrl);
	}
	
	function checkResponse(data){
		if (data){
			data = eval('('+data+')');
			if (data['status']){
				insertSkimlinks();
			}
		}
	}
	
	function checkUrl(){
        if (current_location.indexOf('https://') === 0){
            return false;
        }
        
		getScript(exclusionApiUrl+"/?url="+encodeURIComponent(current_url)+"&callback=checkResponse");	
	}
	
	function __init(){
		checkUrl();
	}
	
	
	
	if (noskim_domains.length){
		for(i=0;i<noskim_domains.length;i++){
			if (current_location.indexOf(noskim_domains[i])!=-1){
				shouldrun = 0;
			}
		}
	}
	
	
	if (shouldrun){
		__init();
		window.checkResponse = checkResponse;
	}

}());
