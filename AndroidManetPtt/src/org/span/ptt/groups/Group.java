package org.span.ptt.groups;

import java.net.InetAddress;
import java.util.List;

public class Group {
	
	public int id = -1;
	public String name = null;
	public List<String> peers = null;
	public InetAddress addr = null;
	
	public Group (int id, String name, List<String> peers, InetAddress addr) {
		this.id = id;
		this.name = name;
		this.peers = peers;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public boolean containsHostAddress(String host) {
		return peers.contains(host);
	}
}