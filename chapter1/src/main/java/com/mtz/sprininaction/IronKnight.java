package com.mtz.sprininaction;

public class IronKnight implements Knight{
	private Quest quest;
	public IronKnight(Quest quest) {
		this.quest = quest;
	}
	@Override
	public void fight() {
		this.quest.printQuest();
	}

}
