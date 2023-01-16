package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_config implements IJsonMapCreator
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
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(48);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("org_migrated", "");
			stack.push(new ArrayList<>(1));
			map1.put("iOSUsageDescription", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(9));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("NSLocationAlwaysUsageDescription", "");
					map1.put("NSLocationWhenInUseUsageDescription", "如果没有使用地理位置访问权限，您就无法准确地获取个人地理位置等；有了地理位置访问权限，可以实时定位自己的位置等");
					map1.put("NSLocationAlwaysAndWhenInUseUsageDescription", "网教通-通用版请求使用地理位置权限，支持发送微博的位置信息");
					map1.put("NSSiriUsageDescription", "");
					map1.put("NSCameraUsageDescription", "如果没有相机访问权限，您就无法发送图文消息、扫描二维码、发送小视频、其他功能等；有了相机访问权限，您就能发送图文消息、录制小视频、其他功能等");
					map1.put("NSRemindersUsageDescription", "如果没有提醒事项权限，您就无法收到各种新消息的通知提醒等；允许提醒事项权限，您就可以收到各种新消息的通知提醒等");
					map1.put("NSMicrophoneUsageDescription", "如果没有麦克风访问权限，您就无法发送语音消息、语音微博、其他功能等；");
					map1.put("NSPhotoLibraryAddUsageDescription", "");
					map1.put("NSPhotoLibraryUsageDescription", "如果没有相册访问权限，您就无法发送图文消息、发送小视频、其他功能等；有了相机访问权限，您就能发送图文消息、其他功能等");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(1));
			map1.put("android", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(6));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android_app_bundles", "");
					map1.put("android_lancher_icon", "");
					map1.put("versionMinSdk", "21");
					map1.put("android_debug_mode", "false");
					map1.put("targetSdkVersion", "31");
					map1.put("notice", "https://gcdncs.101.com/v0.1/static/cs_app_native_storage/1609900897890.png");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("org_type", "");
			map1.put("uc_version", "1");
			map1.put("label", "101成长社区");
			map1.put("rn_debug_mode", "false");
			stack.push(new ArrayList<>(1));
			map1.put("ios", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(6));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios_standard_architecture", "");
					map1.put("pad", "true");
					map1.put("versionMinSdk", "11.0");
					map1.put("ios_ats_arbitrary", "forbid_arbitrary");
					stack.push(new ArrayList<>(1));
					map1.put("universal_link_paths", stack.peek());
					{
						list1 = (ArrayList<Object>) stack.peek();
						list1.add("/qq_conn/101945596/*");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("UIFileSharing", "");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("unified_url", "http://growth.eda-site.101.com");
			map1.put("support_cdn", "false");
			map1.put("main_page", "cmp://com.nd.smartcan.appfactory.main_component/main?pageid=1543200991430");
			map1.put("filename", "101Growth");
			stack.push(new ArrayList<>(5));
			map1.put("multi_channel", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("channel_name", "xiaomi");
					map1.put("url", "https://gcdncs.101.com/v0.1/static/cs_app_native_storage/1665766059531.zip");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("channel_name", "vivo");
					map1.put("url", "https://gcdncs.101.com/v0.1/static/cs_app_native_storage/1665766063970.zip");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("channel_name", "oppo");
					map1.put("url", "https://gcdncs.101.com/v0.1/static/cs_app_native_storage/1665766076876.zip");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("channel_name", "huawei");
					map1.put("url", "https://gcdncs.101.com/v0.1/static/cs_app_native_storage/1665766070652.zip");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("channel_name", "tencent");
					map1.put("url", "https://gcdncs.101.com/v0.1/static/cs_app_native_storage/1665766082729.zip");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("v_org_name", "");
			map1.put("sdp-migrated", "");
			map1.put("appid", "e88126a5-eb17-4812-94be-266abfda3186");
			map1.put("inst_id", "");
			map1.put("org_name", "");
			map1.put("version_code_start", "");
			map1.put("node_id", "");
			map1.put("launcher", "cmp://com.nd.sdp.uc_component/user_agreement");
			map1.put("env", "30");
			map1.put("dns_enable", "false");
			map1.put("stage", "eda");
			map1.put("env_client", "eda");
			stack.push(new ArrayList<>(2));
			map1.put("language", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("name", "en");
					map1.put("display", "English");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "en");
						map1.put("ios", "en");
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
					map1.put("name", "zh-CN");
					map1.put("display", "简体中文");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "zh-CN");
						map1.put("ios", "zh-Hans");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("i18n", stack.peek());
			func_0((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("build_time", 1673865021618L);
			map1.put("scope", "app");
			map1.put("allow_check_update", "true");
			stack.push(new ArrayList<>(18));
			map1.put("language_list", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "English");
					map1.put("name", "en");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "en");
						map1.put("ios", "en");
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
					map1.put("display", "简体中文");
					map1.put("name", "zh-CN");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "zh-CN");
						map1.put("ios", "zh-Hans");
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
					map1.put("display", "繁體中文（香港）");
					map1.put("name", "zh-HK");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "zh-HK");
						map1.put("ios", "zh-Hant-HK");
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
					map1.put("display", "繁體中文（台灣）");
					map1.put("name", "zh-TW");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "zh-TW");
						map1.put("ios", "zh-Hant");
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
					map1.put("display", "Indonesia");
					map1.put("name", "id");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "in");
						map1.put("ios", "id");
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
					map1.put("display", "ไทย");
					map1.put("name", "th");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "th");
						map1.put("ios", "th");
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
					map1.put("display", "عربي");
					map1.put("name", "ar");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "ar");
						map1.put("ios", "ar");
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
					map1.put("display", "Malay");
					map1.put("name", "ms");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "ms");
						map1.put("ios", "ms");
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
					map1.put("display", "русский");
					map1.put("name", "ru");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "ru");
						map1.put("ios", "ru");
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
					map1.put("display", "Türkçe");
					map1.put("name", "tr");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "tr");
						map1.put("ios", "tr");
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
					map1.put("display", "German");
					map1.put("name", "de");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "de");
						map1.put("ios", "de");
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
					map1.put("display", "French");
					map1.put("name", "fr");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "fr");
						map1.put("ios", "fr");
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
					map1.put("display", "Spanish");
					map1.put("name", "es");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "es");
						map1.put("ios", "es");
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
					map1.put("display", "日本語");
					map1.put("name", "ja");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "ja");
						map1.put("ios", "ja");
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
					map1.put("display", "Português");
					map1.put("name", "pt_PT");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "pt_PT");
						map1.put("ios", "pt_PT");
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
					map1.put("display", "Português");
					map1.put("name", "pt");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "pt");
						map1.put("ios", "pt");
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
					map1.put("display", "English-US");
					map1.put("name", "en-US");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "en-US");
						map1.put("ios", "en-US");
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
					map1.put("display", "བོད་ཡིག");
					map1.put("name", "bo");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "bo");
						map1.put("ios", "bo");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(2));
			map1.put("language_enable", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				list1.add("en");
				list1.add("zh-CN");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(1));
			map1.put("language_group", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new ArrayList<Object>(1));
				list1.add(stack.peek());
				{
					list1 = (ArrayList<Object>) stack.peek();
					list1.add("zh-CN");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("language_default", stack.peek());
			func_1((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("portal_app_config_host_cdn", "https://portal-app-config.sdp.101.com");
			map1.put("portal_web_domain_host_cdn", "https://portal-web-domain-manage.eda.101.com");
			map1.put("update_host_cdn", "https://portal-android-grey.eda.101.com/");
			map1.put("history_url_cdn", "https://portal-android-grey.eda.101.com/");
			map1.put("lite_app_host_cdn", "https://portal-android-grey.eda.101.com/v1");
			map1.put("portal_app_config_host", "https://portal-app-config.sdp.101.com");
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("portal_web_domain_host", stack.peek());
			func_2((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("update_host", "https://portal-android-grey.eda.101.com/");
			map1.put("history_url", "https://portal-android-grey.eda.101.com/");
			map1.put("lite_app_host", "https://lite-app-server.sdp.101.com/v1");
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("private_light_cs_host", stack.peek());
			func_3((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("cs_offline_host", "http://cs-offline.bd.web.sdp.101.com");
			map1.put("sub_app_manage", "https://sub-app-manage.sdp.101.com/");
			map1.put("domain_service", "https://portal-app-server.sdp.101.com/");
		}
		return map1;
	}
	 
	private void func_0(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("en", "English");
			map1.put("zh-CN", "简体中文");
		}
	}
	 
	private void func_1(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("default", "zh-CN");
			map1.put("chs", "zh-CN");
			map1.put("zh", "zh-CN");
		}
	}
	 
	private void func_2(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("stage", "https://portal-web-domain-manage.eda.101.com");
		}
	}
	 
	private void func_3(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("host", "https://sdpcs.eda.101.com/v0.1");
			map1.put("cdn_host", "https://cdncs.eda.101.com/v0.1");
			map1.put("server_name", "limitation_support_service_eda");
		}
	}
}
