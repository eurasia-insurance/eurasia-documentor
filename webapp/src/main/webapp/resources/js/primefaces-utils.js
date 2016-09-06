function handleDialogHide(xhr, status, args, dialogWidget) {
	if (args.validationFailed) {
		dialogWidget.show();
	} else {
		dialogWidget.hide();
	}
}
function handleDialogShow(xhr, status, args, dialogWidget) {
	if (!args.validationFailed) {
		dialogWidget.show();
	} else {
		dialogWidget.hide();
	}
}
