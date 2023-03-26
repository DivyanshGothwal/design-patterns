package com.learning.design.pattern.creational.builder.version3;

public class F16 {
	
	private boolean isCockpitReady;
	private boolean isPassangerReady;
	private boolean isEngineReady;
	
	public static F16Builder builder() {
		return new F16.F16Builder();
	}
	
	private F16(F16Builder builder){
		this.isCockpitReady = builder.isCockpitReady;
		this.isEngineReady = builder.isEngineReady;
		this.isPassangerReady = builder.isEngineReady;
	}
	
	static class F16Builder {

		private Boolean isCockpitReady;
		private Boolean isPassangerReady;
		private Boolean isEngineReady;
		
		F16.F16Builder cockpitReady(Boolean isCockpitReady){
			this.isCockpitReady = isCockpitReady;
			return this;
		}
		F16.F16Builder passangerReady(Boolean passangerReady){
			this.isPassangerReady = passangerReady;
			return this;
		}
		F16.F16Builder engineReady(Boolean engineReady){
			this.isEngineReady = engineReady;
			return this;
		}
		
		public F16 build() {
			return new F16(this);
		}
	}
}
