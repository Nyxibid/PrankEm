package bid.nyxi.prankemrf.utils.permissions;

public enum Permission {
	
	ADMIN("prankem.admin"),
	SUPER("prankem.*"),
	
	FAKE_OP("prankem.fake.op"),
	FAKE_DEOP("prankem.fake.deop"),
	
	FAKE_ECONOMY_GIVE("prankem.fake.give"),
	FAKE_ECONOMY_PAY("prankem.fake.pay"),
	FAKE_ECONOMY_TAKE("prankem.fake.take"),
	
	FAKE_USER_BAN("prankem.fake.ban"),
	FAKE_USER_KICK("prankem.fake.kick"),
	FAKE_USER_CHAT("prankem.fake.chat"),
	FAKE_USER_JOIN("prankem.fake.join"),
	FAKE_USER_LEAVE("prankem.fake.leave"),
	FAKE_USER_DEATH("prankem.fake.death"),
	FAKE_USER_RANK("prankem.fake.rank"),
	
	MOD_BLIND("prankem.mod.blind"),
	MOD_BOLT("prankem.mod.bolt"),
	MOD_BURN("prankem.mod.burn"),
	MOD_DELAY("prankem.mod.delay"),
	MOD_FREEZE("prankem.mod.freeze"),
	MOD_NOMINE("prankem.mod.nomine"),
	MOD_POISON("prankem.mod.poison"),
	MOD_POISONAPPLE("prankem.mod.poisonapple"),
	MOD_PUMPKINHEAD("prankem.mod.pumpkinhead"),
	MOD_ROCKET("prankem.mod.rocket"),
	MOD_SICKNESS("prankem.mod.sickness"),
	MOD_SLOW("prankem.mod.slow"),
	MOD_SLOWKILL("prankem.mod.slowkill"),
	MOD_SPAM("prankem.mod.spam"),
	MOD_STOPCHAT("prankem.mod.stopchat"),
	MOD_LONELYCHAT("prankem.mod.lonelychat");

	private final String permission;

	Permission(String permission) {
		this.permission = permission;
	}

	public String permission() {
		return permission;
	}

}