package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_routes implements IJsonMapCreator
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
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(38);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("cmp://com.nd.hy.elearning/main", "cmp://com.nd.hy.elearning/forcestudy");
			map1.put("cmp://com.nd.sdp.component.x-user/ks_cloud_doc", "cmp://com.nd.sdp.component.e-nd-wps/open_mine_wps_page");
			map1.put("cmp://com.nd.sdp.component.cect-course-v5/course", "cmp://com.nd.eda.ecourse/course");
			map1.put("cmp://com.nd.sdp.component.cect-course-v5/download", "cmp://com.nd.eda.ecourse/download");
			map1.put("cmp://com.nd.sdp.component.local-data-management/dowmload_manager", "cmp://com.nd.xst.downloader/dowmload_manager");
			map1.put("cmp://com.nd.sdp.component.user-select-framework/main", "cmp://com.nd.xst.edu-class/class_picker");
			map1.put("cmp://com.nd.smartcan.appfactory.main_component/permission_list", "cmp://com.nd.sdp.component.permission/permission_list");
			map1.put("cmp://com.nd.sdp.component.lecture-management2/lectureHomepageV2", "cmp://com.nd.eda.assemble/lectureHomepage");
			map1.put("cmp://com.nd.xst.downloader/resList", "cmp://com.nd.xst.downloader/download_business_list");
			map1.put("cmp://com.nd.eda.assemble/createclass_v2", "cmp://com.nd.eda.assemble/createclass");
			map1.put("cmp://com.nd.social.notice/receivedDetail", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("cmp://com.nd.social.notice/receivedNotice", "cmp://com.nd.sdp.component.edu-space-interaction/list");
			map1.put("cmp://com.nd.social.notice/sendedDetail", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("cmp://com.nd.social.notice/postNotice", "cmp://com.nd.sdp.component.edu-space-interaction/postNotice");
			map1.put("cmp://com.nd.social.notice/feedBack", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("cmp://com.nd.social.notice/detail", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("local://com.nd.sdp.component.h5-notice/index.html#/receivedNotice?_maf_left_button=back&_maf_allow_plays_inline=false", "cmp://com.nd.sdp.component.edu-space-interaction/list");
			map1.put("local://com.nd.sdp.component.h5-notice/index.html#!/receivedDetail?_maf_allow_plays_inline=false", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("local://com.nd.sdp.component.h5-notice/index.html#!/detail?_maf_left_button=back&_maf_allow_plays_inline=false", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("local://com.nd.sdp.component.h5-notice/index.html#!/postNotice", "cmp://com.nd.sdp.component.edu-space-interaction/postNotice");
			map1.put("local://com.nd.sdp.component.h5-notice/index.html#!/feedBack", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("local://com.nd.sdp.component.h5-notice/index.html#!/sendedDetail?_maf_allow_plays_inline=false", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("local://com.nd.sdp.component.h5-notice/index.html", "cmp://com.nd.sdp.component.edu-space-interaction/detail_share");
			map1.put("cmp://com.nd.social.me/me_HomePage", "cmp://com.nd.pbl.pblcomponent/others");
			map1.put("cmp://com.nd.sdp.component.e101-habit-train/publish", "cmp://com.nd.sdp.component.edu-habit-cultivate/quickPublish");
			map1.put("cmp://com.nd.sdp.component.e101-habit-train/mytasklist", "cmp://com.nd.sdp.component.edu-habit-cultivate/list");
			map1.put("cmp://com.nd.sdp.component.e101-habit-train/stuTaskDetail", "cmp://com.nd.sdp.component.edu-habit-cultivate/detail");
			map1.put("cmp://com.nd.sdp.component.ele-online-tutor/test", "cmp://com.nd.sdp.component.xst-online-tutor/test");
			map1.put("cmp://com.nd.sdp.component.ele-online-tutor/online", "cmp://com.nd.sdp.component.xst-online-tutor/online");
			map1.put("cmp://com.nd.social.im/friend_list", "cmp://com.nd.sdp.friend/friend_list");
			map1.put("cmp://com.nd.social.im/friend_remark_name", "cmp://com.nd.sdp.friend/friend_remark_name");
			map1.put("cmp://com.nd.sdp.component.local-data-management/download_business_list", "cmp://com.nd.xst.downloader/download_business_list");
			map1.put("cmp://com.nd.sdp.component.local-data-management/download_resource_list", "cmp://com.nd.xst.downloader/download_resource_list");
			map1.put("cmp://com.nd.sdp.component.local-data-management/setting", "cmp://com.nd.xst.downloader/setting");
			map1.put("cmp://com.nd.sdp.component.elearning-course/alldownloadlist", "cmp://com.nd.xst.downloader/download_business_list");
			map1.put("cmp://com.nd.social.im/AIIntelligentLearningAssistant", "cmp://com.nd.sdp.component.imcustomservice/init");
			map1.put("cmp://com.nd.social.im/AIPostQuestion", "cmp://com.nd.sdp.component.imcustomservice/postQuestion");
			map1.put("cmp://com.nd.social.im/fontsize_setting", "cmp://com.nd.sdp.component.appfontcomponent/fontsize_setting");
		}
		return map1;
	}
}
