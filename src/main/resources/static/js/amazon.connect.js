(function(w, d, x, id){
	s=d.createElement('script');
	s.src='https://d2ct74a929wa9a.cloudfront.net/amazon-connect-chat-interface-client.js';
	s.async=1;
	s.id=id;
	d.getElementsByTagName('head')[0].appendChild(s);
	w[x] =  w[x] || function() { (w[x].ac = w[x].ac || []).push(arguments) };
})(window, document, 'amazon_connect', '5bcfd0fe-b1bd-497b-b676-4d508d181c46');
amazon_connect('styles', { openChat: { color: '#ffffff', backgroundColor: '#2d6c31'}, closeChat: { color: '#ffffff', backgroundColor: '#c80e33'} });
amazon_connect('snippetId', 'QVFJREFIZ2hQL0pvd1JoM1RkT2R1L3NXL3lNdml6dmxkWnl0QVhSZkNxL24zazB4MUFFUTZLd09yQjBKeWNxUEdVWjRSb2YwQUFBQWJqQnNCZ2txaGtpRzl3MEJCd2FnWHpCZEFnRUFNRmdHQ1NxR1NJYjNEUUVIQVRBZUJnbGdoa2dCWlFNRUFTNHdFUVFNWFZYOUhDY1VPbnRnT01ZeEFnRVFnQ3YxbGxzcDhXVTRjWjE1L0o2MG02YWFRSW9KYVRRMWRYeHI0WS8yaG9kV0J1OVRyc05nYjdtV2VFenk6OjFtRE9Lb0lJeDdaeTBWSE41WmdUU2JUUHJyVEhoSzdqWnBWYTYzNzk2NlJiWlM2QVArUkk3cWF6VkgwTUFpSHN2YnMyTkJEWFFKRXlTNitIS1hSenRHYkpVcFdFNHBKSngyUFlmRWNldlhPcXpKMzNuY25UdmxoU2dwcm5wcGZORlN2S3g0MndNRE1KQytxaVpCb0FxKy92NGdTMkVPaz0=');
amazon_connect('supportedMessagingContentTypes', [ 'text/plain', 'text/markdown' ]);