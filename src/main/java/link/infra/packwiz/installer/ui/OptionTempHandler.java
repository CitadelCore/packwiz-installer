package link.infra.packwiz.installer.ui;

// Serves as a proxy for IOptionDetails, so that setOptionValue isn't called until OK is clicked
public class OptionTempHandler implements IOptionDetails {
	private final IOptionDetails opt;
	private boolean tempValue;

	public OptionTempHandler(IOptionDetails opt) {
		this.opt = opt;
		tempValue = opt.getOptionValue();
	}

	public String getName() {
		return opt.getName();
	}

	public String getOptionDescription() {
		return opt.getOptionDescription();
	}

	public boolean getOptionValue() {
		return tempValue;
	}

	public void setOptionValue(boolean value) {
		tempValue = value;
	}

	public void finalise() {
		opt.setOptionValue(tempValue);
	}

}
