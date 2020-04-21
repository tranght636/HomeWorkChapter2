function calTinhToanAPI(input1, input2){
	clearTimeout($(input1).data('timeout'));
	$(input1).data('timeout', setTimeout(function() {
		var params = {
				toanHang1 : $(input1).val(),
				toanHang2 : $(input2).val()
			};
		console.log(params);
		if ($(input1).val() !== '') {
			$.ajax({
				url : '/api/lab2',
				type : 'POST',
				data : $.param(params),
				success : function(result) {
					$("#ket-qua").val(result);
				}
			});
		}
	}, 50));
}

$(document).ready(function() {
	$('#toan-hang-1').keyup(function() {
		calTinhToanAPI(this, $('#toan-hang-2'));
	});
	
	$('#toan-hang-2').keyup(function() {
		calTinhToanAPI(this, $('#toan-hang-1'));
	});
	
	$('.btnMua').click(function(event) {
		
		var soLuong = $(this).closest('tr').find('.soLuong').val();
		var stt = $(this).closest('tr').find('.stt').attr('value');
		//var slMua = $('#soLuongMua').val();
		
        if (soLuong >0) {
            //$('#soLuongMua').val(parseInt(soLuong)+parseInt(slMua));
        	var params = {
        			soLuong: soLuong,
        			stt: stt
        	}
        	$.ajax({
				url : '/api/lab3',
				type : 'POST',
				data : $.param(params),
				success : function(result) {
					$("#soLuongMua").val(result);
				}
			});
        }
    });
	$('#btn-dat-hang').click(function(){
		window.location = "/lab3?action=gio_hang";
	});
});