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
});