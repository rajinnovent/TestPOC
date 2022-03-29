/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.RandomTask;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.action.impl.WeightedBlock;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class TestB2CFlow_Schedule_A1EB5760382B7256C668B46665366137
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public TestB2CFlow_Schedule_A1EB5760382B7256C668B46665366137(IContainer parent, String name) {
		super(parent, name, "A1EB5760382B7256C668B46665366137");
		super.actualScheduleName = "TestB2CFlow";
		setThinkScheme(IKThinkControl.FIXED);
		setThinkFixed(2000);

	}

	public void execute() {

		this.addEventBehavior(
				new RPTEventStructure(new HTTPPageTitleVPEvent(), null, 1, "Page title verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new HTTPResponseCodeVPEvent(), null, 1, "Response code verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new HTTPResponseSizeVPEvent(), null, 1, "Response size verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTContinueEvent("End of dataset reached"), 2, "End of dataset reached"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1, "Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTContinueEvent("Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));

		HashMap http_hm = new HashMap();
		http_hm.put("Chk-Collect-Individual-Page-Element-data", "true"); // add line speed enabled flag 
		this.addInitially(new FeatureOptionsDataAreaCreation(this, "com.ibm.rational.test.lt.feature.http", http_hm));
		this.addUserGroup(new UserGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "User Group 1", "A1EA98F365EB365CFF9FE13165613463");

			setNumUsers(100.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EA98F365EB3667FF9FE13165613463") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					For loopNm_1 = Loop_1(this);
					this.add(loopNm_1);
					loopNm_1.addVarsToInit(null);

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent, "Loop1", "A1EA98F3AE08AB20FF9FE13165613463", 60, 1000, 0, 0, 1, true, false,
				null) {

			public void executeLoop() {

				this.add(randomLoop_1(this));
				super.executeLoop();
			}

		};
		return forLoop;
	}

	private RandomTask randomLoop_1(IContainer parent) {
		RandomTask randomTask = new RandomTask(parent, "Random Selector", "A1EA98F3929F4DD0FF9FE13165613463", 1) {
			public void execute() {
				this.add(weightedBlock_1(this));
				this.add(weightedBlock_2(this));
				this.add(weightedBlock_3(this));
				super.execute();
			}
		};
		return randomTask;
	}

	private WeightedBlock weightedBlock_1(IContainer parent) {
		WeightedBlock wtBlock = new WeightedBlock(parent, "Guest Checkout", "A1EA98F3A6F80B53FF9FE13165613463", 5) {

			public void execute() {
				this.add(new test.B2C_Homepage_Test_A1EB576225606D20C668B46665366137(this,
						"A1EB59CBB0887C62CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_G_PickMultiProductsAndAddToCart_Test_A1EB57603973CF20C668B46665366137(this,
						"A1EB59CBB0887C67CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_GoToCart_Test_A1EB576039635498C668B46665366137(this,
						"A1EB59CBB0887C6CCE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_GoToCheckout_Test_A1EB5762250EF1C0C668B46665366137(this,
						"A1EB59CBB0887C71CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_CreateNewAddress_Test_A1EB57622661B254C668B46665366137(this,
						"A1EB59CBB0887C76CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_PaymentInstructions_Test_A1EB576037FDD0F0C668B46665366137(this,
						"A1EB59CBB0887C7BCE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_ReviewOrder_Test_A1EB57603783E600C668B46665366137(this,
						"A1EB59CBB0887C80CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_PlaceOrder_Test_A1EB576038322878C668B46665366137(this,
						"A1EB59CBB0887C85CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				super.execute();
			}
		};

		return wtBlock;
	}

	private WeightedBlock weightedBlock_2(IContainer parent) {
		WeightedBlock wtBlock = new WeightedBlock(parent, "Guest Browse", "A1EA98F3A6F80B8CFF9FE13165613463", 27) {

			public void execute() {
				this.add(new test.B2C_Homepage_Test_A1EB576225606D20C668B46665366137(this,
						"A1EB59CBBC0C54D2CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_G_PickProduct_Test_A1EB5762252D799AC668B46665366137(this,
						"A1EB59CBBC0C54D7CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				super.execute();
			}
		};

		return wtBlock;
	}

	private WeightedBlock weightedBlock_3(IContainer parent) {
		WeightedBlock wtBlock = new WeightedBlock(parent, "Guest Search", "A1EA9DFE3B297C50ED2AB33234333138", 17) {

			public void execute() {
				this.add(new test.B2C_Homepage_Test_A1EB576225606D20C668B46665366137(this,
						"A1EB59CBC4CC2B42CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_SearchBySearchterm_Test_A1EB576037DF2848C668B46665366137(this,
						"A1EB59CBC4CC2B47CE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.B2C_G_ProductDetails_Test_A1EB576225A47B00C668B46665366137(this,
						"A1EB59CBC4CC2B4CCE15E43061383839") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				super.execute();
			}
		};

		return wtBlock;
	}

}