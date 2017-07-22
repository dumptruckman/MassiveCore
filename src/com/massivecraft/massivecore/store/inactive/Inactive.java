package com.massivecraft.massivecore.store.inactive;

import com.massivecraft.massivecore.store.SenderColl;

// This interface only really makes sense for SenderEntity's
// But by using this conversion to non-senders should be easier when that is done
public interface Inactive
{
	long getLastActivityMillis();
	SenderColl<? extends Inactive> getColl();
	
	void preClean();
	void postClean();
}
