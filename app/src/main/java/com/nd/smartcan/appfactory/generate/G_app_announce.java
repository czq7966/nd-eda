package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_announce implements IJsonMapCreator
{
	@Override
	public /*modify-src*/ Map<String, Object> createMap() 
	{
		if (cacheMap != null) {
			return cacheMap;
		}
		cacheMap = _createMap();
		return cacheMap;
	}
	
	private static Map<String, Object> cacheMap;

	public Map<String, Object> _createMap()
	{
		Stack<Object> stack = new Stack();
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(2);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(123));
			map1.put("native", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "app-faq");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xst_faq.XSTFAQComponent");
					map1.put("ios", "XCloudAppFaqComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.android.org.server.adapter");
						map1.put("name", "orgserveradapter");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.cq.commonres.UserAdapterComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component.im");
						map1.put("name", "suspentionwindow");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "SuspensionWindowComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component.elsearch");
						map1.put("name", "ele-search");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.ele.android.search.EleSearchComponent");
					map1.put("ios", "ElearningSearchComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "mob-stat-baidu");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "mob_stat_baiduComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.hy.android.video");
						map1.put("name", "video");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.video.player.VideoPlayerComponent");
					map1.put("ios", "ElearnVideoComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "neworganizationcomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "OrgTreeForORGSDK");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-behavior-rewards");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.behavior.rewards.BehaviorRewardComponent");
					map1.put("ios", "XstBehaviorRewardsComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "im");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.module_im.appFactoryComponent.IMComponent");
					map1.put("ios", "IMSComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "el-eye-comfort");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.eye.comfort.EyeComfortComponent");
					map1.put("ios", "ECIEyeComfortComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.sensitivewordfilter");
						map1.put("name", "sensitivewordfilter");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.censorsdk.CensorComponent");
					map1.put("ios", "SensitiveWordComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "im-orgtree-plugin");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.uc.OrgTreeComponent");
					map1.put("ios", "OrgTreeComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "nduccomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.uc.nduc.NdUcComponent");
					map1.put("ios", "NDUCCComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "groupentrycondition");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "nd.sdp.android.im.group_joinpolicy.appfactory.GroupJoinPolicyComponent");
					map1.put("ios", "IMJoinGroupComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "payment");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.ndpayment.NdPaymentComponent");
					map1.put("ios", "NDPaymentComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "xs-commons");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "XCBaseComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "wallet");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.star.wallet.base.WalletComponent");
					map1.put("ios", "WalletComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "iappay");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "MUPApplePayKit");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.edu.ap.component");
						map1.put("name", "parent-child-raship");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.edu.ap.raship.component.ChildShipCom");
					map1.put("ios", "edu_ap_parent_child_raship_sdk_iosObjC_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.common");
						map1.put("name", "flow-control");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.common.flowcontrol.FlowControlComponent");
					map1.put("ios", "FCIFlowControlComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "user-select-framework");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.edu.user.select.framework.UserSelectFrameworkComponent");
					map1.put("ios", "user_select_framework_iOS");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "qqshare");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "SocialShareQQComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-live-public");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xst.plive.PublicLiveComponent");
					map1.put("ios", "XLivePublicComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "thirdloginfacebook");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.thirdlogin.ThirdLoginComponentFacebook");
					map1.put("ios", "UCFacebookComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.hy");
						map1.put("name", "elearning");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.module.mutual.MutualComponent");
					map1.put("ios", "ELMUCComplexTab");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "elearning-configs");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.configs.ConfigsComponent");
					map1.put("ios", "ElearningConfigManager");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.eda");
						map1.put("name", "ecourse");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.coursev5.CourseV5Component");
					map1.put("ios", "CectCourseV5ComponentImpl");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "e-nd-wps");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.wps.BizComponent");
					map1.put("ios", "ENDWPSComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-player");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.android.player.cmp.XPlayerComponent");
					map1.put("ios", "XSTPlayerComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component.im");
						map1.put("name", "ndpush");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.im.push.IMPushComponent");
					map1.put("ios", "XPushComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "el-mediaplayer-sdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "ElearningMediaplayerComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "applepay-component");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "ApplePayComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "consult");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xst.ask.XAskComponent");
					map1.put("ios", "XSTConsultComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component.im");
						map1.put("name", "im-coresdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.coresdk.component.IMCoreComponent");
					map1.put("ios", "IMSDKComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-cicada-player");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "XSTCicadaplayerComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "x-app-stat");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.mob.stat.MobStatComponent");
					map1.put("ios", "x_app_stat_iosComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "uc-avatar-edit");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.uc.avataredit.UcAvatarEditComponent");
					map1.put("ios", "MUIAvatarEditor");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.eda");
						map1.put("name", "euser");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.edauser.XUserComponent");
					map1.put("ios", "XUserComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "ui-universal-popup");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.module_popup.CommonPopupComponent");
					map1.put("ios", "BirthdayWishesComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.smartcan.appfactory");
						map1.put("name", "main_component");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.component.MainComponent");
					map1.put("ios", "APFMainComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "video-player-sdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.ele.android.exp.main.ExamPlayerComponent");
					map1.put("ios", "ELMediaSDKComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "edu-homework");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.homework.HomeworkComponent");
					map1.put("ios", "EHIComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "edu-class");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xst.classmember.selector.XClassMemberSelectorComponent");
					map1.put("ios", "XClassmemberSelectorComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "permission");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.apf.permission.ApfPermissionComponent");
					map1.put("ios", "APFPermissionComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-uc-ext");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.uc.ext.XUcExtComponent");
					map1.put("ios", "XUCExtendComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "mui-audio");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "MUIAudioView");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "userinfo-view-single-app");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.userinfoview.group.UserInfoGroupViewComponent");
					map1.put("ios", "UserViewGroupComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "e-omc");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.org.manager.OrgManagerComponent");
					map1.put("ios", "EomcComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp");
						map1.put("name", "common_skin_component");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.common.res.CommonResComponent");
					map1.put("ios", "CommonSkinComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.smartcan.appfactory.maincomponent");
						map1.put("name", "ext-lightapp-hotupdate");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.smartcan.light.app.component.LightAppComponent");
					map1.put("ios", "APFLightAppComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.appfactory");
						map1.put("name", "jssdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.smartcan.appfactoryjssdk.JsSdkComponent");
					map1.put("ios", "APFJavascriptSDKComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.eda");
						map1.put("name", "assemble");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xcloud_assemble.XCloudAssembleComponent");
					map1.put("ios", "XCloudAssembleComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "e-teacher-studio");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.studio.teacher.BizComponent");
					map1.put("ios", "ETSTeacherStudioComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "filesystem-plugin");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "FileSystemComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "x-class-manage");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xclassmanager.XClassManagerComponent");
					map1.put("ios", "XClassManageComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp");
						map1.put("name", "thirdlogincom");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.thirdlogin.ThirdLoginComponent");
					map1.put("ios", "OpenIDLoginComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "edu-space-interaction");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.ele.android.nitice.ElNoitceComponent");
					map1.put("ios", "edu_space_inter_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "groupstick-plugin");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.im.plugin.groupstick.GroupMessageStickComponent");
					map1.put("ios", "IMCGroupStickComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "nduc-selector");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.nduc.selector.SelectorComponent");
					map1.put("ios", "UCSelectorComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "groupshareplug-in");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.anroid.im.groupshare.component.GroupShareComponent");
					map1.put("ios", "GroupShareComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "catalogservice");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "CACCatalogComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "demo-rn");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.rncommon.demo.RNCommonComponent");
					map1.put("ios", "RNCommonComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "socialShare");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.socialshare.config.ShareComponent");
					map1.put("ios", "SocialShareComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "app-startup");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.xst.startup.XSTStartUpComponent");
					map1.put("ios", "XSTAppStartupComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "aggregationsearchcomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.common.search_widget.SearchWidgetComponent");
					map1.put("ios", "AggregateSearchComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "mob-stat-umeng");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "mob_stat_umengComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.pbl");
						map1.put("name", "pblcomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.pbl.pblcomponent.base.LifeComponent");
					map1.put("ios", "pbl_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "mob-stat-bugly");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "mob_stat_buglyComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "tag-sdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "TagsManager");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component.common");
						map1.put("name", "nd-avatarloader");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "MUIAvatar");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.library");
						map1.put("name", "cscom");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.cs.CsComponent");
					map1.put("ios", "CSComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "imstickcomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "IMTopComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "edu-habit-cultivate");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xhabitcultivate.XHabitCultivateComponent");
					map1.put("ios", "edu_habit_cultivate_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "edu-studycontent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.content.lib.player.ContentLibPlayerComponent");
					map1.put("ios", "edu_contentlib_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "countryselect");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.countryselect.CountrySelectComponent");
					map1.put("ios", "MUICountrySelect");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "xst-online-tutor");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.liveadapter.LiveAdapterComponent");
					map1.put("ios", "XSTOnlineTutorComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social.component");
						map1.put("name", "score");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.score.ScoreComponent");
					map1.put("ios", "ScoreComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "appsetting");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.setting.guide.SettingComponent");
					map1.put("ios", "AppSettingComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "offline-teaching");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.android.offline.teaching.OfflineTeachingComponent");
					map1.put("ios", "XOfflineTeachingComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "edu-schedule");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.ele.schedule.ScheduleComponent");
					map1.put("ios", "ESIComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "ele-channel");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.ele.channel.ChannelSpaceComponent");
					map1.put("ios", "el_channel_ios_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "muitiplephoto");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "MUIPhotosBridge");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.pbl");
						map1.put("name", "weixinpay");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "StartupComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "rbaccmp");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.social.rbac.RBACComponent");
					map1.put("ios", "RbacComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-word-chains");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xst.wchains.WordChainsComponent");
					map1.put("ios", "XWordChainsComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-textbook");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.xst.study.actv.StudyActExtendComponent");
					map1.put("ios", "XTextbookComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.pbl");
						map1.put("name", "alipay");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "alipay");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "pointpay");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.ndpayment.NdPointPayComponent");
					map1.put("ios", "PointPay_Component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "remark-name-mo");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.social3.remark.RemarkNameComponent");
					map1.put("ios", "RemarkNameComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "imagepicker");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.photosbridge.PhotosbridgeComponent");
					map1.put("ios", "MUIPhotoSelector");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "microblog-mobile-common");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.social.nvweibo.NVWeiboComponent");
					map1.put("ios", "MMCComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.hy.android");
						map1.put("name", "reader");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.reader.biz.ReaderComponent");
					map1.put("ios", "ElearnDocumentComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "el-identity-switch");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.elearning.identityswitch.IdentitySwitchComponent");
					map1.put("ios", "ElIdetitySwitchComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "mypagesdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.pagesdk.MypageSdkComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "text-editor-censor-plugin");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.module_texteditor_censor_plugin.TextEditorCensorPluginComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp");
						map1.put("name", "friend");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.im.friend.ui.FriendComponent");
					map1.put("ios", "IMFriendComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "mob-stat-ty");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "mob_stat_tyComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "mui-videocontroller");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.social.mediaRecorder.VideoComponent");
					map1.put("ios", "MUIVideoSupportComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "app-center");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.app.center.XAppCenterComponent");
					map1.put("ios", "xst_app_centerComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "content-interact");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.interact.cmp.XstInteractComponent");
					map1.put("ios", "XstContentInteractComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "edu-family");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.ele.family.EduFamilyComponent");
					map1.put("ios", "EduFamilyComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp");
						map1.put("name", "uc_component");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.uc.UcComponent");
					map1.put("ios", "UCComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "el-rescard");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.refactor.elearning.carlibrary.ElCardComponent");
					map1.put("ios", "el_rescard_ios_Component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "el-smartlink");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.ele.smartlink.SmartLinkComponent");
					map1.put("ios", "ELSmartLComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "qr-code");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.qrcode.module.QRCodeComponent");
					map1.put("ios", "QRCodeComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "groupprohibitspeakplugin");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.im.group.banned.component.GroupBanComponent");
					map1.put("ios", "IMGroupProhibitSpeakComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "downloader");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.course.download.DownloadManagerComponent");
					map1.put("ios", "XstDownloaderComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "payment-appstore");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "NDPaymentAPComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-teaching-research");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.teacher.research.TeacherResearchComponent");
					map1.put("ios", "XSTTeacherResearchComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "e-prepare-lessons");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.prepare.lesson.BizComponent");
					map1.put("ios", "EPLPrepareLessonsComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.eda");
						map1.put("name", "e-study-activity");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.xst.study.actv.StudyActComponent");
					map1.put("ios", "XStudyActivityComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "ele-data-collection");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.sdp.data.collect.sdk.EleDataCollectComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.edu.component");
						map1.put("name", "el-router");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.edu.router.sdk.EleRouterComponent");
					map1.put("ios", "ELERouterComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "imcommonjsbridge");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "IMJSBridgeComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "configure");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.centralsdk.ConfigCentralComponent");
					map1.put("ios", "CCCConfigurationCentralComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "e-training-activities");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.teaching.research.BizComponent");
					map1.put("ios", "ETATrainingActivitiesComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "ele-my-study");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.elearning.mystudy.EleMyStudyComponent");
					map1.put("ios", "Elearn_my_studyComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "social3-common");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "Social3Component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "imcustomservice");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.im.customerservice.component.CustomerServiceComponent");
					map1.put("ios", "AILearningAssistantComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "x-live");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xlive.XLiveComponent");
					map1.put("ios", "XLiveComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "appfontcomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.appfont.component.FontSizeComponent");
					map1.put("ios", "MUPAppFontComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social3");
						map1.put("name", "orgs");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.social3.org.internal.OrgComponent");
					map1.put("ios", "OrgComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "mob-stat-sa");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "mob_stat_saComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(4));
			map1.put("local-h5", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("host", "");
					map1.put("version", "1.60.59");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "model-app");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("host", "");
					map1.put("version", "1.0.13");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "edu-selector");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("host", "");
					map1.put("version", "12.9.32");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "h5-social-biz");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("host", "");
					map1.put("version", "1.0.0");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "model-source-app");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
		return map1;
	}
}
