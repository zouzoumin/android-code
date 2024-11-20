package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class text1_fragment1 extends Fragment {

    private RecyclerView recyclerView;
    private MusicAdapter musicAdapter;
    private List<Music> musicList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text1_fragment1, container, false);

        recyclerView = view.findViewById(R.id.rc_fragment_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize and set up the music list
        musicList = getMusicList(); // Function to get a list of music items
        musicAdapter = new MusicAdapter(musicList, new MusicAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Music music) {
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra("music", music); // Send the music item to the detail activity
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(musicAdapter);

        return view;
    }

    private List<Music> getMusicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(new Music("我愿", "阿虾", R.drawable.j1, R.raw.music2, "我愿化做一条小溪 缠绕着你\n" +
                "在你开心的时候 泛起涟漪\n" +
                "我愿化作一团乌云 守护着你\n" +
                "在你哭泣的时候 我来临\n" +
                "我不愿看到你流泪的眼睛\n" +
                "望着他的背影\n" +
                "头也不回的就丢下你\n" +
                "我不愿看到你委屈的表情\n" +
                "像个乞丐等待他来临\n" +
                "抚平你的心灵\n" +
                "我愿化做一条小溪 缠绕着你\n" +
                "在你开心的时候 泛起涟漪\n" +
                "我愿化作一团乌云 守护着你\n" +
                "在你哭泣的时候 我来临\n" +
                "我不愿看到你流泪的眼睛\n" +
                "望着他的背影\n" +
                "头也不回的就丢下你\n" +
                "我不愿看到你委屈的表情\n" +
                "像个乞丐等待他来临\n" +
                "抚平你的心灵\n" +
                "我不愿看到你流泪的眼睛\n" +
                "望着他的背影\n" +
                "头也不回的就丢下你\n" +
                "我不愿看到你委屈的表情\n" +
                "像个乞丐等待他来临\n" +
                "抚平你的心灵\n" +
                "在没有你的夜里"));
        musicList.add(new Music("好久不见", "陈奕迅", R.drawable.j2, R.raw.haojiubujian, "我来到 你的城市\n" +
                "走过你来时的路\n" +
                "想像着 没我的日子\n" +
                "你是怎样的孤独\n" +
                "拿着你 给的照片\n" +
                "熟悉的那一条街\n" +
                "只是没了你的画面\n" +
                "我们回不到那天\n" +
                "你会不会忽然的出现\n" +
                "在街角的咖啡店\n" +
                "我会带着笑脸 挥手寒暄\n" +
                "和你 坐着聊聊天\n" +
                "我多么想和你见一面\n" +
                "看看你最近改变\n" +
                "不再去说从前 只是寒暄\n" +
                "对你说一句 只是说一句\n" +
                "好久不见\n" +
                "拿着你 给的照片\n" +
                "熟悉的那一条街\n" +
                "只是没了你的画面\n" +
                "我们回不到那天\n" +
                "你会不会忽然的出现\n" +
                "在街角的咖啡店\n" +
                "我会带着笑脸 挥手寒暄\n" +
                "和你 坐着聊聊天\n" +
                "我多么想和你见一面\n" +
                "看看你最近改变\n" +
                "不再去说从前 只是寒暄\n" +
                "对你说一句 只是说一句\n" +
                "好久不见"));
        // Add more songs as needed
        musicList.add(new Music("活着", "郝云", R.drawable.j4, R.raw.huozhe, "每天站在高楼上\n" +
                "\n" +
                "看着地上的小蚂蚁\n" +
                "\n" +
                "它们的头很大\n" +
                "\n" +
                "它们的腿很细\n" +
                "\n" +
                "它们拿着苹果手机\n" +
                "\n" +
                "它们穿着耐克阿迪\n" +
                "\n" +
                "上班就要迟到了\n" +
                "\n" +
                "它们很着急\n" +
                "\n" +
                "我那可怜的吉普车\n" +
                "\n" +
                "很久没爬山也没过河\n" +
                "\n" +
                "它在这个城市里\n" +
                "\n" +
                "过得很压抑\n" +
                "\n" +
                "虽然它什么都没说\n" +
                "\n" +
                "但我知道它很难过\n" +
                "\n" +
                "我悄悄地许下愿望\n" +
                "\n" +
                "带它去蒙古国\n" +
                "\n" +
                "慌慌张张 匆匆忙忙\n" +
                "\n" +
                "为何生活总是这样\n" +
                "\n" +
                "难道说我的理想\n" +
                "\n" +
                "就是这样度过一生的时光\n" +
                "\n" +
                "不卑不亢 不慌不忙\n" +
                "\n" +
                "也许生活应该这样\n" +
                "\n" +
                "难道说六十岁以后\n" +
                "\n" +
                "再去寻找我想要的自由\n" +
                "\n" +
                "一年一年飞逝而去\n" +
                "\n" +
                "还是那一点点小积蓄\n" +
                "\n" +
                "我喜欢的好多东西\n" +
                "\n" +
                "还是买不起\n" +
                "\n" +
                "生活总是麻烦不断\n" +
                "\n" +
                "到现在我还没习惯\n" +
                "\n" +
                "都说钱是王八蛋\n" +
                "\n" +
                "可长得真好看\n" +
                "\n" +
                "慌慌张张 匆匆忙忙\n" +
                "\n" +
                "为何生活总是这样\n" +
                "\n" +
                "难道说我的理想\n" +
                "\n" +
                "就是这样度过一生的时光\n" +
                "\n" +
                "不卑不亢 不慌不忙\n" +
                "\n" +
                "也许生活应该这样\n" +
                "\n" +
                "难道说六十岁以后\n" +
                "\n" +
                "再去寻找我想要的自由\n" +
                "\n" +
                "我不想这样活着\n" +
                "\n" +
                "我不想这样活着\n" +
                "\n" +
                "我不想这样活着\n" +
                "\n" +
                "我不想这样活着\n" +
                "\n" +
                "我不想这样活着\n" +
                "\n" +
                "我不想这样活着\n" +
                "\n" +
                "我不想这样活着\n" +
                "\n" +
                "我不想这样活着\n" +
                "\n" +
                "我不想这样\n" +
                "\n" +
                "慌慌张张 匆匆忙忙\n" +
                "\n" +
                "为何生活总是这样\n" +
                "\n" +
                "难道说我的理想\n" +
                "\n" +
                "就是这样度过一生的时光\n" +
                "\n" +
                "不卑不亢 不慌不忙\n" +
                "\n" +
                "也许生活应该这样\n" +
                "\n" +
                "难道说六十岁以后\n" +
                "\n" +
                "再去寻找我想要的自由\n" +
                "\n" +
                "其实我也常对自己说\n" +
                "\n" +
                "人要学会知足而常乐\n" +
                "\n" +
                "可万事都一笑而过\n" +
                "\n" +
                "还有什么意思呢\n"));
        musicList.add(new Music("生生世世爱", "吴雨菲", R.drawable.j5, R.raw.shengsshishi, "爱还没来天地间风云忽然变\n" +
                "有情有义的人都要回来\n" +
                "爱总会来生死注定的来世再爱\n" +
                "都等了太久哭尽无奈\n" +
                "rap:她从树种来追随前世真爱\n" +
                "亲身体验过春去秋又来\n" +
                "情到至深时乌发也浓白\n" +
                "剑成人后心动话灿烂地开\n" +
                "爱恨纠缠的生生世世\n" +
                "心底执着的信念为你存在\n" +
                "多遥远的路都阻挡不住\n" +
                "再次拥有没距离的温度\n" +
                "失去自由的生生世世\n" +
                "有爱不懂相拥错过了最爱\n" +
                "送一剑祝福再默默相助\n" +
                "恐怕没以后不自觉留退路\n" +
                "rap:一段记忆有三世那么长\n" +
                "到最后要用一碗水去遗忘\n" +
                "千年寂寞侯你重见阳光\n" +
                "还是转头又纵身跳火海化成凤凰\n" +
                "为情所困的生生世世\n" +
                "伤也被命中成双的伤害\n" +
                "等不到日出一个人孤独\n" +
                "让星光代替我伴你远途\n" +
                "黑白轮回的生生世世\n" +
                "彻底放开成全永远的依赖\n" +
                "是乱世英雄或凡间俗梦\n" +
                "爱不离爱是把这感动留住"));
        musicList.add(new Music("为你我受冷风吹", "林忆莲", R.drawable.j6, R.raw.weiniwshoulenfc, "为你我受冷风吹，寂寞时候流眼泪\n" +
                "\n" +
                "有人问我是与非，说是与非\n" +
                "\n" +
                "可是谁又真的关心谁，若是爱已不可为\n" +
                "\n" +
                "你明白说吧无所谓，不必给我安慰\n" +
                "\n" +
                "何必怕我伤悲，就当我从此收起真情谁也不给\n" +
                "\n" +
                "我会试着放下往事，管它过去有多美\n" +
                "\n" +
                "也会试着不去想起，你如何用爱将我包围\n" +
                "\n" +
                "那深情的滋味，但愿我会就此放下往事\n" +
                "\n" +
                "忘了过去有多美，不盼缘尽仍留慈悲\n" +
                "\n" +
                "虽然我曾经这样以为，我真的这样以为\n" +
                "\n" +
                "为你我受冷风吹，寂寞时候流眼泪\n" +
                "\n" +
                "有人问我是与非，说是与非\n" +
                "\n" +
                "可是谁又真的关心谁，若是爱已不可为\n" +
                "\n" +
                "你明白说吧无所谓，不必给我安慰\n" +
                "\n" +
                "何必怕我伤悲，就当我从此收起真情谁也不给\n" +
                "\n" +
                "我会试着放下往事，管它过去有多美\n" +
                "\n" +
                "也会试着不去想起，你如何用爱将我包围\n" +
                "\n" +
                "那深情的滋味，但愿我会就此放下往事\n" +
                "\n" +
                "忘了过去有多美，不盼缘尽仍留慈悲\n" +
                "\n" +
                "虽然我曾经这样以为，我真的这样以为\n" +
                "\n" +
                "为你我受冷风吹，寂寞时候流眼泪\n" +
                "\n" +
                "有人问我是与非，说是与非\n" +
                "\n" +
                "可是谁又真的关心谁，关心谁\n" +
                "\n" +
                "会关心谁，谁会关心谁"));
        musicList.add(new Music("想见你想见你想见你", "林俊杰", R.drawable.j7, R.raw.xiangjiann, "当爱情遗落成遗迹\n" +
                "用象形刻划成回忆\n" +
                "想念几个世纪\n" +
                "才是刻骨铭心\n" +
                "若能回到冰河时期\n" +
                "多想把你抱紧处理\n" +
                "你的笑多疗愈\n" +
                "让人生也苏醒\n" +
                "失去 你的风景\n" +
                "像座废墟 像失落文明\n" +
                "能否 一场奇迹 一线生机\n" +
                "能不能 有再一次 相遇\n" +
                "想见你 只想见你\n" +
                "未来过去 我只想见你\n" +
                "穿越了 千个万个 时间线里\n" +
                "人海里相依\n" +
                "用尽了 逻辑心机\n" +
                "推理爱情 最难解的谜\n" +
                "会不会 你也 和我一样\n" +
                "在等待一句 我愿意\n" +
                "任时光更迭了四季\n" +
                "任宇宙物换或星移\n" +
                "永远不退流行\n" +
                "是青涩的真心\n" +
                "未来 先进科技\n" +
                "无法模拟 你拥抱暖意\n" +
                "如果 另个时空 另个身体\n" +
                "能不能 换另一种 结局\n" +
                "想见你 只想见你\n" +
                "未来过去 我只想见你\n" +
                "穿越了 千个万个 时间线里\n" +
                "人海里相依\n" +
                "用尽了 逻辑心机\n" +
                "推理爱情 最难解的谜\n" +
                "会不会 你也 和我一样\n" +
                "在等待一句 我愿意\n" +
                "想见你 每个朝夕\n" +
                "想见你 每个表情\n" +
                "想穿越 每个平行\n" +
                "在未来 和过去 紧紧相依\n" +
                "想follow 每则IG\n" +
                "不错过 你的踪迹\n" +
                "会不会 你也一样\n" +
                "等待着那句 我愿意\n" +
                "想见你 只想见你\n" +
                "未来过去 我只想见你\n" +
                "穿越了 千个万个 时间线里\n" +
                "人海里相依\n" +
                "用尽了 逻辑心机\n" +
                "推理爱情 最难解的谜\n" +
                "会不会 你也 和我一样\n" +
                "在等待一句 我愿意\n" +
                "想见你 每个朝夕\n" +
                "想见你 每个表情\n" +
                "想穿越 每个平行\n" +
                "在未来 和过去 紧紧相依\n" +
                "想follow 每则IG\n" +
                "不错过 你的踪迹\n" +
                "会不会 你也一样\n" +
                "等待着那句 我愿意\n" +
                "想见你 每个朝夕\n" +
                "想见你 每个表情\n" +
                "想穿越 每个平行\n" +
                "在未来 和过去 紧紧相依\n" +
                "想follow 每则IG\n" +
                "不错过 你的踪迹\n" +
                "会不会 你也一样\n" +
                "等待着那句 我愿意"));
        musicList.add(new Music("挂羊头卖狗肉", "王以太", R.drawable.j8, R.raw.guayant, "挂羊头\n" +
                "卖狗肉\n" +
                "表面说我们都是朋友\n" +
                "却想把你心偷走\n" +
                "挂羊头\n" +
                "卖狗肉\n" +
                "明明好多心里话能说\n" +
                "却用礼貌语问候\n" +
                "我是谁你是谁我是谁\n" +
                "我是谁你是谁我是谁\n" +
                "我是谁是你的谁我是谁\n" +
                "我是谁是你的谁你是我的谁\n" +
                "没想到没想到\n" +
                "你的一切我都想要\n" +
                "后悔以前我没强调\n" +
                "结果就是被绑票\n" +
                "没什么大的理由要逃避\n" +
                "但是要考虑\n" +
                "换算感情的几何\n" +
                "朋友情人如何取舍\n" +
                "小心的搭了你的肩\n" +
                "为了能读懂你的言语\n" +
                "第二天翘课陪你看了\n" +
                "午夜场的电影\n" +
                "称兄道弟\n" +
                "所以顺理成章送你回去\n" +
                "但到底该站哪里\n" +
                "纠结应该怎么前进\n" +
                "气氛到底应不应该被烘托\n" +
                "窗户纸应不应该被捅破\n" +
                "情书回到了我的背包\n" +
                "调整了配方和我的配料\n" +
                "采集挥发掉的微笑我\n" +
                "暂时不要回报我\n" +
                "Smile at me\n" +
                "Please repeat\n" +
                "累计回忆你会be with me\n" +
                "没有柴米油盐酱醋\n" +
                "你还不用为我热爱音乐而让步\n" +
                "我能陪你感受\n" +
                "朋友才会感到的心酸\n" +
                "不是理所应当\n" +
                "但我帮你分一半\n" +
                "操场下班路上看了日落\n" +
                "我放下了喜欢就要拥有的执着\n" +
                "说明天约个午饭不吃晚饭\n" +
                "今天不要等我晚安你说我\n" +
                "挂羊头卖狗肉\n" +
                "表面说我们都是朋友\n" +
                "却想把你心偷走\n" +
                "挂羊头\n" +
                "卖狗肉\n" +
                "明明好多心里话能说\n" +
                "却用礼貌语问候\n" +
                "我是谁你是谁我是谁\n" +
                "我是谁你是谁我是谁\n" +
                "我是谁是你的谁我是谁\n" +
                "我是谁是你的谁你是我的谁\n" +
                "什么担忧慢慢说我来找你\n" +
                "什么糗事慢慢说我不笑你\n" +
                "想要给你干干净净的空气\n" +
                "我的情绪透明你不会感到lonely\n" +
                "Let me take you for a ride\n" +
                "朝向家门外\n" +
                "目的地由你来定\n" +
                "崎岖山路我来开\n" +
                "永远不索要更多\n" +
                "比如只有我和你\n" +
                "带上你朋友\n" +
                "嗨别跟我客气\n" +
                "其实我愿意信星座但它说我们不合\n" +
                "要怎样才证明你我气场足够独特\n" +
                "也许要糖衣炮弹\n" +
                "或良药苦口\n" +
                "你会为哪句回眸\n" +
                "想听什么let me know\n" +
                "Let me know\n" +
                "Let me know\n" +
                "怎样你才会点头\n" +
                "直接答应或破灭\n" +
                "留或走我没理由\n" +
                "Let me know\n" +
                "Let me know\n" +
                "请你解答我问题\n" +
                "该走你左边或背后\n" +
                "别让我只能够\n" +
                "挂羊头\n" +
                "卖狗肉\n" +
                "表面说我们都是朋友\n" +
                "却想把你心偷走\n" +
                "挂羊头\n" +
                "卖狗肉\n" +
                "明明好多心里话能说\n" +
                "却用礼貌语问候\n" +
                "我是谁你是谁我是谁\n" +
                "我是谁你是谁我是谁\n" +
                "我是谁是你的谁我是谁\n" +
                "我是谁是你的谁你是我的谁\n" +
                "我的谁"));
        musicList.add(new Music("好久不见", "陈奕迅", R.drawable.j2, R.raw.haojiubujian, ""));
        musicList.add(new Music("好久不见", "陈奕迅", R.drawable.j2, R.raw.haojiubujian, ""));
        musicList.add(new Music("好久不见", "陈奕迅", R.drawable.j2, R.raw.haojiubujian, ""));


        return musicList;
    }


}
