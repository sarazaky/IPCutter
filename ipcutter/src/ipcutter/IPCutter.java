package ipcutter;

public class IPCutter {
	private String ip;
	
	public IPCutter(String ip) {
		this.ip = ip;
	}
	
	public int[] getIpLst() {
		String[] ipLst = ip.split("[.]");
		int[] result = new int[4];
		if(ipLst.length != 4) {
			System.out.println("Wrong IP Address");
		}
		else {
			for(int i=0;i<4;i++) {
				result[i] = Integer.parseInt(ipLst[i]);
			}	
		}
		return result; 
		
	}

}
