package iotlink.com;

public class Option {
	public String pathFile;
	public String needFind;
	public int numLine;
	public String[] args;
	public Option(String[] args) {
		this.args = args;
		numLine = 1;
		for (int i = 0; i < args.length; i++) {
			if(args[i].equals("-f")) {
				pathFile = args[i + 1];
			}
			if(args[i].equals("-c")) {
				needFind = args[i + 1];
			}
			if(args[i].equals("-l")) {
				numLine = Integer.parseInt(args[i + 1]);
			}
		}
	}
}
