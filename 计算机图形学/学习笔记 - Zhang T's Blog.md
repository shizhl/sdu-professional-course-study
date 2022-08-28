![计算机图形学-学习笔记](https://zhangt.top/thumbnails/Computer-Graphics-Study-Notes.png)

 2019-05-02  2021-11-09

 3 小时 读完 (大约 29509 个字) 0次访问

## [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AC%AC1%E7%AB%A0-%E7%BB%AA%E8%AE%BA "第1章 绪论")第1章 绪论

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%85%A8%E4%B9%A6%E6%A6%82%E8%BF%B0 "全书概述")全书概述

-   图形学基本知识
    -   光栅图形学
        -   扫描转换、区域填充、裁减、反走样、消隐
    -   二维、三维图形变换及观察准均匀 B 样条曲线
-   几何造型
    -   参数曲线曲面基本概念、Bezier曲线曲面、B样条曲线等
-   真实感图形学
    -   颜色模型、简单光照模型、纹理映射、光线跟踪

### 计算机图形学定义")计算机图形学定义

-   计算机图形学
    -   计算机图形是计算机产生的图像。
    -   计算机图形学就是研究如何在计算机中表示图形、以及利用计算机进行图形的计算、处理和显示的相关原理和算法。
    -   IEEE定义：Comput graphics is the art or science of producing graphical images with the aid of computer.
-   计算机图形学的发展和应用在某种意义上已成为计算机软、硬件发展水平的标志。

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%AE%A1%E7%AE%97%E6%9C%BA%E5%9B%BE%E5%BD%A2%E5%AD%A6%E7%A0%94%E7%A9%B6%E5%86%85%E5%AE%B9 "计算机图形学研究内容")计算机图形学研究内容

-   主要研究内容
    -   如何在计算机中表示图形、以及利用计算机进行图形的计算、处理和显示的相关原理与算法，构成了计算机图形学的主要研究内容。
-   计算机生成一副表示物体的图形的三个步骤
    -   造型技术
        -   在计算机中建立所要生成图像的物体的模型，即给出表示该物体的几何数据和拓扑关系
        -   比如教室里的桌子、椅子、墙，用圆柱、平面等表示出来。
    -   光照模型
        -   希望用一些简单的数学模型来近似、代替那些物理学的模型，为模拟物体表面的光照物理现象的数学模型叫光照模型。
    -   绘制（渲染）技术
        -   选择适当的绘制算法来把这个场景画 (渲染) 出来。
        -   绘制一幅三维物体图像所涉及的知识，实际上就是计算机图形中每个像素看上去应该是什么颜色的问题。
-   计算机图形的发展方向
    -   准确性 -> 真实性 -> 实时性

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%AE%A1%E7%AE%97%E6%9C%BA%E5%9B%BE%E5%BD%A2%E5%AD%A6%E7%9A%84%E5%8F%91%E5%B1%95%E5%8E%86%E5%8F%B2 "计算机图形学的发展历史")计算机图形学的发展历史

-   1950年，第一台图形显示器作为美国麻省理工学院 (MIT) 旋风 I 号计算机的附件诞生。
    
-   1963年，Suther land 发表博士论文。其中第一次提出了 graphics 这个词。
    
    -   **Suther land 被公认为开创交互式图形技术的奠基人，被称为 “计算机图形学之父”，并于 1988 年获 “图灵奖”。**
-   1962年，雷诺汽车公司的工程师 Bezier 提出 Bezier 曲线、曲面的理论，成为 CAGD (计算机辅助几何设计) 的先驱。
    
-   1964年，MIT教授 Steven A. Coons 提出了超限插值的新思想，通过插值四条任意的边界曲线来构造曲面。
    
-   70年代，光栅显示器出现了。光栅显示器屏幕是由像素组成的，由此诞生了大量算法，如区域填充、裁剪、消隐等基本图形概念、及其相应算法。
    
-   真实感图形和几何造型技术这个时候也开始出现了。
    
-   1975年，Phong 提出了著名的简单光照模型 - Phong模型 (标志着真实感图形的出现和实用化，直到现在 Phong 模型还被大量的采用)
    
-   1980年，Whitted 提出了光透视模型 - Whitted 模型，成为第一次提出光线跟踪算法的范例。
    
-   几何造型技术：通俗地讲，该技术就像小孩搭积木，用简单的一些体素来构建复杂的模型。
    
    [![1560589193983](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560589193983.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560589193983.png)
    

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%AE%A1%E7%AE%97%E6%9C%BA%E5%9B%BE%E5%BD%A2%E5%AD%A6%E7%9A%84%E5%BA%94%E7%94%A8%E9%A2%86%E5%9F%9F "计算机图形学的应用领域")计算机图形学的应用领域

-   人机交互和图形用户界面
    -   最理想的是开发 “能听、能说、能理解人类语言” 的计算机，人们可以和计算机交谈，而不像现在这样仅限于窗口、图标、鼠标、指针 (WIMP) 界面。
-   计算机辅助设计与制造 (CAD/CAM)
    -   CAD/CAM 是计算机图形学在工业界最广泛、最活跃的应用领域。
        -   飞机、汽车、船舶、宇宙飞船的外形设计
        -   发电厂、化工厂等的布局
-   真实感图形实时绘制与自然景物仿真
    -   计算机中重现真实世界的场景叫做真实感绘制。
-   计算机动画、游戏、电影
-   计算机艺术
    -   计算机艺术是科学与技术相结合的一门新兴的交叉学科，是计算机应用的一个崭新、富有时代气息的领域。
-   计算机仿真
    -   计算机仿真是计算机技术建立被仿真系统的模型，并在某些实验条件下对模型进行动态实验的一门综合性技术。
-   科学计算可视化
-   虚拟现实
    -   虚拟现实是利用计算机模拟现实的场景，使参与者获得与现实一样的感觉。
    -   准确地说，是利用电脑模拟产生一个三维空间的虚拟世界，提供使用者关于视觉、听觉、触觉等感官的模拟，让使用者如同身历其境一般，可以及时、没有限制地观察三度空间内的事物。
-   地理信息系统
    -   地理信息系统是建立在地理图形之上的关于各种资源的综合信息管理系统，是计算机图形学的一个重要应用领域。
-   农业上的应用
    -   借助计算机图形生成技术来保存和再现不同作物种类和不同生长时期的植物形态，模拟植物的生长过程，从而合理地进行选种、播种、田间管理以及收获等。

计算机图形系统组成

-   五大功能
    
    -   一个交互式计算机图形系统应具有计算、存储、对话、输入和输出等 5 个方面的功能。
        
        [![1560589234970](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560589234970.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560589234970.png)
    
-   图形系统
    
    -   图形软件
        -   图形应用数据结构：对应一组图形数据文件，其中存放着欲生成的图形对象的全部描述信息。
        -   图形应用软件
            -   解决某种应用问题的图形软件，是图形系统中的核心部分，包括了各种图形生成和处理技术。如：photoshop、3Dmax等。
            -   图形支撑软件：大多数图形应用程序是建立在一定的图形支撑软件上。图形支撑软件需具有规范接口。
    -   图形硬件

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9B%BE%E5%BD%A2%E6%98%BE%E7%A4%BA%E8%AE%BE%E5%A4%87 "图形显示设备")图形显示设备

-   阴级射线管
    -   使用广泛：现在的图形显示设备绝大多数是基于阴极射线管 (CRT) 的显示器。
    -   阴极射线管的技术指标
        -   **分辨率：一个阴极射线管在水平和垂直方向单位长度上能识别出的最大光点数称之为分辨率。光点亦称之为像素 (pixel)。**
        -   显示速度
    -   要保持荧光屏上有稳定的图像就必须不断地发射电子束。只有刷新频率高到一定值后，图像才能稳定显示。大约达到每秒 60 帧即 60Hz 时，人眼才能感觉到屏幕不闪烁，要人眼觉得舒服，一般必须有 85Hz 以上的刷新频率。
-   彩色阴极射线管
    -   三只电子枪，分别涂有红、绿、蓝三种颜色的光。
-   CRT图形显示器
    -   随机扫描的图形显示器 (画线设备)
        -   电子束的扫描轨迹随显示内容而变化，只在需要的地方扫描，而不必全屏扫描，因此速度快，图像清晰。
        -   一条线一条线地画图，因此也称为向量显示器。
        -   随机扫描系统是为画线应用设计的，因此不能显示逼真的有阴影场景。
    -   光栅扫描显示器 (画点设备)
        -   不能直接从一个可编地址的像素画一条直线到另一个可编地址的像素，只可能用尽可能靠近这条直线路径的像素点来近似地表示这条直线。
        -   在光栅扫描系统中，电子束横向扫描屏幕，一次一行，从上到底顺次进行。当电子束横向沿每一行移动时，电子束的强度不断变化来建立亮点的图案。
        -   由于光栅扫描系统具有存储每一个屏幕点亮度信息的能力，所以，最适合显示浓淡和色彩图形。
-   例题：显卡有 2MB 显存，当分辨率为 1024×768 时，可支持的色彩数是多少？  
    2MB\=2×1024×1024\=2097152(字节)  
    1024×768\=786432(个像素)  
    每个像素如果需要 3 个字节表示，将超过 2MB 显存，最多只需要 2 个字节表示，故只能支持 64K 色彩数

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9B%BE%E5%BD%A2%E5%AD%A6%E7%9B%B8%E5%85%B3%E6%A6%82%E5%BF%B5 "图形学相关概念")图形学相关概念

-   分辨率
    -   光点
        -   光点指电子束打在显示器荧光屏上，显示器能够显示的最小的发光点，一般用其直径来表明光点的大小。
    -   像素点
        -   像素点是指图形显示在屏幕上时候，按当前的图形显示分辨率所能提供的最小元素点。
    -   屏幕分辨率
        -   屏幕上显示的像素个数，以 (水平像素数 \* 垂直像素数) 表示。
    -   显示分辨率
        -   是计算机显示控制器所能够控制的显示模式分辨率，简称显示模式。
        -   对于文本显示方式，显示分辨率用水平和垂直方向上所能显示的字符总数的乘积来表示。
        -   对于图形显示方式，则用水平和垂直方向上所能显示的像素点总数的乘积来表示。
    -   显卡分辨率
        -   显卡分辨率就是表示显卡输出给显示器，并能在显示器上描绘像素点的数量。
        -   一台电脑的最高分辨率是由显卡和显示器共同决定的。显示器最高分辨率是可以显示出来的最大分辨率。显卡的最大分辨率是最大能支持多少分辨率。
        -   电脑的最高分辨率取决于显卡和显示器最低的一个。
-   显示器的点距
    -   指相邻像素点之间的距离。两点之间的距离越小越好。
    -   15寸显示器，点距达到0.28mm就足够。17寸显示器，需要0.27mm、0.25mm等。
-   显示卡的作用与性能指标
    -   显示卡的基本作用就是显示图文，显示卡和显示器构成了计算机的显示系统。
    -   除了CPU和内存外，显卡对计算机的显示性能起着决定性的作用。

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9B%BE%E5%BD%A2%E5%9B%BE%E5%83%8F%E7%9A%84%E5%8C%BA%E5%88%AB%E5%8F%8A%E5%AD%98%E5%82%A8%E6%A0%BC%E5%BC%8F "图形图像的区别及存储格式")图形图像的区别及存储格式

-   图形图像的区别
    
    -   说法一
        -   图形是由计算机绘制而成的，而图像则是人为的用外部设备所捕捉到的外部的景象。
    -   说法二
        -   图形是矢量图，而图像是位图 (点阵图)
-   图形 (像) 的构成属性
    
    -   几何属性
        -   刻画对象的轮廓、形状。包括点、线、面、体等。
    -   非几何属性
        -   视觉属性，刻画对象的颜色、材质等。包括明暗、色彩、纹理、透明性、线型、线宽。
    -   从构图要素上看，将图形分为两类
        -   几何属性有突出作用：工程图、等高线地图、曲面的线框图
        -   非几何属性有突出作用 (明暗图)：真实感图形
-   位图和矢量图定义
    
    -   位图 (点阵图)
        -   点阵图或像素图，计算机屏幕上的图是由屏幕上的像素构成的，每个点用二进制数据来描述其颜色与亮度等信息。
    -   矢量图
        -   面向对象的图形或绘图图形，是用数学方式描述的曲线及曲线围成的色块制作的图形。
        -   矢量文件中的图形元素称为对象。每个对象都是一个自成一体的实体，它具有颜色、形状、轮廓、大小和屏幕位置等属性。
-   位图和矢量图区别
    
    -   存储方式的区别
        
        -   点阵文件存储图的各个像素点的位置信息、颜色信息以及灰度信息。
        -   矢量文件是用数学方程、数学形式对图形进行描述，通常使用图形的形状参数和属性参数来表示图形。
        -   因此，点阵文件存储空间比矢量文件大。
    -   缩放的区别
        
        -   点阵文件与分辨率有关，即在一定面积的图像上包含有固定数量的像素。
        -   矢量图形与分辨率无关，可以将它缩放到任意大小和以任意分辨率在输出设备上打印出来，不会影响清晰度。
    -   存储格式的区别
        
        -   位图存储格式：BMP、TIFF、GIF、JPEG、PNG
        -   矢量图存储格式：DXF、SVG、EPS、WMF、EMF
    -   总结
        
        位图
        
        矢量图
        
        存储内容
        
        各像素点位置信息、颜色信息以及灰度信息
        
        数学方程
        
        存储空间
        
        大
        
        小
        
        常见存储格式
        
        BMP、TIFF、GIF、JPEG、PNG
        
        DXF、SVG、EPS、WMF、EMF
        
        图形缩放
        
        失真
        
        不失真
        
        真实感图形效果
        
        容易实现
        
        不容易实现
        

## [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AC%AC2%E7%AB%A0-%E5%85%89%E6%A0%85%E5%9B%BE%E5%BD%A2%E5%AD%A6 "第2章 光栅图形学")第2章 光栅图形学

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%9B%B4%E7%BA%BF%E6%AE%B5%E7%9A%84%E6%89%AB%E6%8F%8F%E8%BD%AC%E6%8D%A2 "直线段的扫描转换")直线段的扫描转换

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%95%B0%E5%80%BC%E5%BE%AE%E5%88%86%E6%B3%95%EF%BC%88DDA%EF%BC%89 "数值微分法（DDA）")数值微分法（DDA）

对于线段 (x0,y0)→(x1,y1)，其斜率为 k\=y1−y0x1−x0 。

从点 (x0,y0)→(x0+Δx,y0+kΔx)→(x0+2Δx,y0+2kΔx)→⋯→(xi,yi)→⋯→(x1,y1) 逐步绘点

[![1556937014719](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556937014719.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556937014719.png)

1  
2  
3  
4  
5  
6  
7  
8  

void DDALine(int x0, int y0, int x1, int y1, Color PIXEL\_COLOR)  
{  
 int x;  
 float dx = x1-x0, dy = y1-y0;  
 float k = dy/dx, y = y0;  
 for(x=x0;x<=x1;x++,y+=k)  
 drawPixel(x, int(y+0.5), PIXEL\_COLOR);   
}  

需要注意的是——斜率问题，上述算法仅在斜率 |k|≤1 的情况适用，因为这种情况下，x每次增加1，y每次最多增加1。当 |k|\>1时，可以举例看到 (0,0)→(2,5)以及 (0,0)→(2,100) 都将只有三个点绘成！

这种情况下，只要把 x、y 的地位互换即可。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  

void DDALine(int x0, int y0, int x1, int y1, Color PIXEL\_COLOR)  
{  
 if(x0 > x1) swap(x0, x1), swap(y0, y1);   
 bool bigK = abs(y1-y0)>x1-x0;   
 if(bigK) swap(x0, y0), swap(x1, y1);   
 float k = (y1-y0)\*1.0f/(x1-x0), y = y0;  
 for(int x=x0;x<=x1;x++,y+=k)  
 if(bigK) drawPixel(int(y+0.5), x, PIXEL\_COLOR);  
 else drawPixel(x, int(y+0.5), PIXEL\_COLOR);  
}  

注意，代码中没有特判处理 k\=0 情况。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%B8%AD%E7%82%B9%E7%94%BB%E7%BA%BF%E6%B3%95 "中点画线法")中点画线法

在DDA画直线过程中，当前点 (x0,y0)，下一个点可能是 (x0+1,y0) 或 (x0+1,y0+1) ，所以采用四舍五入进行抉择，本质上来说，真实交点在中点 M(x0+1,y0+0.5) 上方，则选 (x0+1,y0+1) ，下方则选 (x0+1,y0) 。

中点画线法，就是基于这种思想，判断交点与中点的位置关系，替代原本四舍五入这一涉及浮点数的方法去做抉择，并且核心是从斜截式方程改为一般式方程。

对于线段 (x0,y0)→(x1,y1)，其一般式方程为 F(x,y)\=ax+by+c，其中a\=y0−y1，b\=x1−x0，c\=x0y1−x1y0 。

将中点带入方程，构建判别式 d\=F(M)\=F(xp+1,yp+0.5)\=a(xp+1)+b(yp+0.5)+c，

-   若 d≥0， 则交点在中点下方，画点 (xp+1,yp)，下一次 d‘\=F(xp+2,yp+0.5)\=d+a，增量为 a；
    
-   若 d<0， 则交点在中点上方，画点 (xp+1,yp+1)，下一次 d‘\=F(xp+2,yp+1.5)\=d+a+b，增量为 a+b；
    

从 (x0,y0) 开始画线时候，d 的初值 d0\=F(x0+1,y0+0.5)\=F(x0,y0)+a+0.5b\=a+0.5b，涉及浮点数，故采用 2d 替代 d 摆脱浮点数，此时，算法仅包含整数运算。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  

void MidPointLine(int x0, int y0, int x1, int y1, Color PIXEL\_COLOR)  
{  
 int a,b,d1,d2,d,x,y;  
 a = y0-y1, b = x1-x0, d=2\*a+b;  
 d1 = 2\*a, d2 = 2\*(a+b);  
 x = x0, y = y0;  
 drawPixel(x, y, PIXEL\_COLOR);  
 while(x < x1)  
 {  
 if(d < 0) x++, y++, d+=d2;  
 else x++, d+=d1;  
 drawPixel(x, y, PIXEL\_COLOR);  
 }  
}  

注意，代码仅处理了 0≤k≤1 情况。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bresenham%E7%AE%97%E6%B3%95 "Bresenham算法")Bresenham算法

Bresenham算法类似于中点法，由误差项符号决定下一个像素取右边点或右上点。

对于线段 (x0,y0)→(x1,y1)，其斜截式为 y\=kx+b，对于 (x0,y0) 的下一个点理应为 (x0+1,round(y0+k))，即将 y0+k 四舍五入，又因为其中 y0为整数，故只需要判断 k 与 0.5 的大小关系。同理，下下个点 (x0+2,round(y0+2k))，决定因素是 2k，或者说 2k 的小数部分，故增量为 k，注意模1。我们接下来用 e 表示当前误差项。

[![1556937103971](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556937103971.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556937103971.png)

第一个优化：将判断 e 与 0.5 的大小关系，优化为判断 e−0.5 与 0 的大小关系，即 e 的初值设置。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  

void bresenhamLine(int x0, int y0, int x1, int y1, Color PIXEL\_COLOR)  
{  
 int x = x0, y = y0;  
 float k = (y1-y0)\*1.0/(x1-x0), e = \-0.5;  
 for(int i=0;i<=x1-x0;i++)  
 {  
 drawPixel(x, y, PIXEL\_COLOR);  
 x++; e+=k;  
 if(e >= 0) y++, e--;  
 }  
}  

第二个优化：将 e 整数化，由于算法中只用到误差项的符号，原增量 k·Δ\=y1−y0x1−x0·Δ，移项后 k·(x1−x0)Δ\=(y1−y0)Δ，考虑上 e 的初值设置，故将增量换成 k‘\=k·(x1−x0)Δ\=(y1−y0)Δ，e0\=Δ·−(x1−x0)/2。要完全去浮点数，取 Δ\=2 即可。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  

void bresenhamLine(int x0, int y0, int x1, int y1, Color PIXEL\_COLOR)  
{  
 int x = x0, y = y0, dx = x1-x0, dy = y1-y0;  
 int e = -dx;  
 for(int i=0;i<=dx;i++)  
 {  
 drawPixel(x, y, PIXEL\_COLOR);  
 x++; e+=2\*dy;  
 if(e >= 0) y++, e-=2\*dx;  
 }  
}  

同时注意，算法中仅处理了0≤k≤1 情况。

第三个优化：处理斜率 k≥1 情况，和DDA方法一样，将x、y 地位互换。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  

void bresenhamLine(int x0, int y0, int x1, int y1, Color PIXEL\_COLOR)  
{  
 if(x0 > x1) swap(x0, x1), swap(y0, y1);   
 bool bigK = y1-y0>x1-x0;   
 if(bigK) swap(x0, y0), swap(x1, y1);  
 int x = x0, y = y0, dx = x1-x0, dy = y1-y0;  
 int e = -dx;  
 for(int i=0;i<=dx;i++)  
 {  
 drawPixel(bigK?y:x, bigK?x:y, PIXEL\_COLOR);  
 x++; e+=2\*dy;  
 if(e >= 0) y++, e-=2\*dx;  
 }  
}  

第四个优化：处理斜率为负数情况，将线段沿着 x 轴对称后做上述算法，画点时 y 值注意乘-1。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  
15  
16  

void bresenhamLine(int x0, int y0, int x1, int y1, Color PIXEL\_COLOR)  
{  
 if(x0 > x1) swap(x0, x1), swap(y0, y1);   
 bool negK = y1<y0;   
 if(negK) y0=-y0, y1=-y1;  
 bool bigK = y1-y0>x1-x0;   
 if(bigK) swap(x0, y0), swap(x1, y1);  
 int x = x0, y = y0, dx = x1-x0, dy = y1-y0;  
 int e = -dx;  
 for(int i=0;i<=dx;i++)  
 {  
 drawPixel(bigK?y:x, negK?(bigK?-x:-y):(bigK?x:y), PIXEL\_COLOR);  
 x++; e+=2\*dy;  
 if(e >= 0) y++, e-=2\*dx;  
 }  
}  

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9C%86%E5%BC%A7%E7%9A%84%E6%89%AB%E6%8F%8F%E8%BD%AC%E6%8D%A2 "圆弧的扫描转换")圆弧的扫描转换

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9C%86%E7%9A%84%E5%85%AB%E5%AF%B9%E7%A7%B0%E6%80%A7 "圆的八对称性")圆的八对称性

(x,y)、(y,x)、(−x,y)、(y,−x)、(x,−y)、(−y,x)、(−x,−y)、(−y,−x) 对称。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  

void drawEightCirclePoints(int x, int y, Color c, int size=1)  
{  
 glPointSize(size);  
 glColor3f(c.r, c.g, c.b);  
 glBegin(GL\_POINTS);  
 glVertex3f(cx+x, cy+y, 0.0f); glVertex3f(cx+y, cy+x, 0.0f);  
 glVertex3f(cx-x, cy+y, 0.0f); glVertex3f(cx+y, cy-x, 0.0f);  
 glVertex3f(cx+x, cy-y, 0.0f); glVertex3f(cx-y, cy+x, 0.0f);  
 glVertex3f(cx-x, cy-y, 0.0f); glVertex3f(cx-y, cy-x, 0.0f);  
 glEnd();  
 glFlush();  
}  

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%B8%AD%E7%82%B9%E7%94%BB%E5%9C%86%E6%B3%95 "中点画圆法")中点画圆法

由于中点画圆法与Bresenham画线法有相似之处，故又被称为Bresenham画圆法。

圆：F(x,y)\=x2+y2−R2，圆内的点 F(x,y)<0，圆外的点 F(x,y)\>0。

[![1556699209242](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556699209242.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556699209242.png)

构建判别式：d\=F(M)\=F(xp+1,yp−0.5)\=(xp+1)2+(yp−0.5)2−R2。

-   若 d<0，画点 P1(xp+1,yp)，下一像素判别式 d1\=F(xp+2,yp−0.5)\=d+2xp+3
-   若 d\>0，画点 P2(xp+1,yp−1)，下一像素判别式 d1\=F(xp+2,yp−1.5)\=d+2(xp−yp)+5

从(0,R)开始顺时针画圆，d 的初始值 d0\=F(1,R−0.5)\=1.25−R

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  

void bresenhamDrawCircle(int cx, int cy, int r)  
{  
 int x, y;  
 float d;  
 x = 0; y = r; d = 1.25\-r;  
 drawEightCirclePoints(cx, cy, x, y, PIXEL\_COLOR, PIXEL\_SIZE);  
 while(x <= y)  
 {  
 if(d < 0) d+=2\*x+3;  
 else d+=2\*(x-y)+5, y--;  
 x++;  
 drawEightCirclePoints(cx, cy, x, y, PIXEL\_COLOR, PIXEL\_SIZE);  
 }  
}  

考虑优化掉浮点数，优化乘法为加法。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%B8%AD%E7%82%B9%E7%94%BB%E6%A4%AD%E5%9C%86%E6%B3%95 "中点画椭圆法")中点画椭圆法

与中点画圆法类似，参照则写即可。

椭圆：F(x,y)\=b2x2+a2y2−a2b2

[![1556699209242](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556699209242.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556699209242.png)

构建判别式：d\=F(M)\=F(xp+1Δ,yp−0.5Δ)\=b2(xp+Δ)2+a2(yp−0.5Δ)2−a2b2。

-   若 d<0，画点 P1(xp+1Δ,yp)，下一像素判别式 d1\=F(xp+2Δ,yp−0.5Δ)\=d+(2xpΔ+3Δ2)b2
    
-   若 d\>0，画点 P2(xp+1Δ,yp−1Δ)，下一像素判别式
    
    d1\=F(xp+2Δ,yp−1.5Δ)\=d+(2xpΔ+3Δ2)b2+(−2ypΔ+2Δ2)a2
    

从(0,b)开始顺时针利用四对称性画椭圆，d 的初始值 d0\=F(1Δ,b−0.5Δ)\=0.25a2Δ2+b2Δ2−a2bΔ。其中 Δ 是网格单位距。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  

void bresenhamDrawOval(int cx, int cy, int a, int b)  
{  
 int x, y;  
 float d;  
 x = 0; y = a; d = 4\*b\*b\-2\*a\*b+a\*a;  
 drawFourOvalPoints(cx, cy, x, y, PIXEL\_COLOR, PIXEL\_SIZE);  
 while(y >= 0)  
 {  
 if(d < 0) d+=2\*b\*b\*x+3\*b\*b;  
 else d+=2\*(b\*b\*x-a\*a\*y)+3\*b\*b+2\*a\*a, y--;  
 x++;  
 drawFourOvalPoints(cx, cy, x, y, PIXEL\_COLOR, PIXEL\_SIZE);  
 }  
}  

如果你认为上述代码能生成一个椭圆，那就错了！

[![1556717142431](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556717142431.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556717142431.png)

椭圆只有四对称性，极接近 x 轴时，会出现切线斜率为 -1 的情况，这时主导地位应换为 y。即要分为两区域画图。在椭圆上过点 P(x0,y0)的切线斜率为：k\=−b2x0a2y0 ，特判 k≤−1时退出第一区域。

[![1556718832370](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556718832370.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556718832370.png)

构建判别式：d\=F(M)\=F(xp+0.5Δ,yp−1Δ)\=b2(xp+0.5Δ)2+a2(yp−1Δ)2−a2b2。

-   若 d<0，画点 P1(xp+1Δ,yp−1Δ)，下一像素判别式 d1\=F(xp+1.5,yp−2)\=d+(−2ypΔ+3Δ2)a2+(2xpΔ+2Δ2)b2
-   若 d\>0，画点 P2(xp,yp−1Δ)，下一像素判别式 d1\=F(xp+0.5Δ,yp−2Δ)\=d+(−2ypΔ+3Δ2)a2

最终版：

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  
15  
16  
17  
18  
19  
20  
21  
22  
23  
24  

void bresenhamDrawOval(int cx, int cy, int a, int b)  
{  
 float x, y;  
 float d;  
 x = 0; y = b; d = 0.25\*a\*a + b\*b - a\*a\*b;  
 drawFourOvalPoints(cx, cy, x, y, PIXEL\_COLOR, PIXEL\_SIZE);  
 while(y >= 0)  
 {   
 if(d < 0) d+=2\*b\*b\*x+3\*b\*b;  
 else d+=2\*(b\*b\*x-a\*a\*y)+3\*b\*b+2\*a\*a, y--;  
 x++;  
 drawFourOvalPoints(cx, cy, x, y, PIXEL\_COLOR, PIXEL\_SIZE);  

 if(-b\*b\*x / (a\*a\*y) <= \-1) break;  
 }  
 d = b\*b\*(x+0.5)\*(x+0.5) + a\*a\*(y\-1)\*(y\-1) - a\*a\*b\*b;  
 while(y >= 0)  
 {   
 if(d > 0) d+=(\-2\*y+3)\*a\*a;  
 else d+=(\-2\*y+3)\*a\*a+(2\*x+2)\*b\*b, x++;  
 y--;  
 drawFourOvalPoints(cx, cy, x, y, PIXEL\_COLOR, PIXEL\_SIZE);  
 }  
}  

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%A4%9A%E8%BE%B9%E5%BD%A2%E7%9A%84%E6%89%AB%E6%8F%8F%E8%BD%AC%E6%8D%A2 "多边形的扫描转换")多边形的扫描转换

多边形的两种表示：

-   顶点表示：直观、几何意义强、占内存少、易进行几何变换，但不能直接用于面着色。
-   点阵表示：便于帧缓冲器表示图形、面着色，但丢失了许多几何信息。

多边形分为：凸、凹多边形，以及含内环的多边形。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#X-%E6%89%AB%E6%8F%8F%E7%BA%BF%E7%AE%97%E6%B3%95-%E6%B4%BB%E6%80%A7%E8%BE%B9%E8%A1%A8%E6%B3%95 "X-扫描线算法(活性边表法)")X-扫描线算法(活性边表法)

1.  从y\=ymin 到 y\=ymax ，每条扫描线 y\=yi 与多边形的相交区间 \[L1,R1\]、⋯、\[Ln,Rn\]
2.  指定颜色显示区间像素 (x,yi) | x\=L1,L1+1,⋯,R1,L2,⋯,Rn

[![1556777590096](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556777590096.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556777590096.png)

当扫描线与多边形顶点相交时，交点的取舍策略为保证交点数目偶数个：

-   若共享顶点的两条边分别落在扫描线的两边，交点只算 1 个
-   若共享顶点的两条边在扫描线的同一边，这时交点作为 0 个或 2 个

[![1557146422539](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557146422539.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557146422539.png)

上述算法（求交、排序、配对、填色）的重要思想是**扫描线**和**增量**，但求交的效率十分低，故算法需要优化，主要从3个方面考虑：

-   与有效边求交：在处理一条扫描线时，仅对与它相交的多边形的边进行求交运算
-   扫描线的连贯性：当前扫描线与各边的交点与下一条扫描线与各边的交点很可能相同或非常相似
-   多边形的连贯性：当某条边与当前扫描线相交时，它很可能也与下一条扫描线相交

引入数据结构 1 ——**活性边表**(AET)：

-   活性边：与当前扫描线相交的边
    
-   表：将活性边按交点 x 坐标升序存放在于链表
    
-   节点内容
    
    -   x：活性边与扫描线的交点 x 坐标
        
    -   Δx ：从”当前扫描线与活性边交点”到”下一条扫描线与活性边交点”间的 x 增量。
        
        由活性边斜率 k\=yi+1−yixi+1−xi⇒Δx\=1kΔ，其中单个 Δ 为扫描线增量。
        
    -   ymax：该活性边所交的最高扫描线的 y 坐标
        

[![1556779269256](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556779269256.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556779269256.png)

引入数据结构 2 ——**新边表**(NET)：

-   表：按照扫描线第一次交于该边的高度，建立链表
-   节点内容
    -   ymax：该边的最高 y 值
    -   xmin：该边**较低点**的 x 值，注意是较低点不是左点
    -   1/k：该边的斜率倒数

[![1556779715911](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556779715911.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556779715911.png)

上图扫描线y\=1 交的两条边P1P2、P1P6 即可以放入活性边表处理。

每次做新的扫描线时，要对活性边进行三个处理：

1.  是否去除该活性边。
    
2.  若不去除，就更新其数据，x\=x+1kΔ
    
3.  根据新边表判断有无新边进入，有则插入排序到活性边表。
    

如此算法避免了求交，伪码如下：

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  
15  
16  
17  

void polyFill(polygon, color)  
{   
 for (各条扫描线i)  
 {   
 初始化新边表头指针NET\[i\];  
 把ymin=i的边放进新边表NET\[i\];  
 }  
 y = 最低扫描线号;  
 初始化活性边表AET为空;  
 for (各条扫描线i)  
 {  
 把NET\[i\]中的边结点用插入排序法插入AET表;  
 遍历AET表,把配对交点区间(左闭右开)上的象素(x,y)，用putpixel(x,y,color)改写象素颜色值;  
 遍历AET表，把ymax=i的结点从AET表中删除,并把ymax>i的结点的x值递增Δx;  
 若允许多边形的边自相交，则用冒泡排序法对AET表重新排序;  
 }  
}  

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%BE%B9%E7%95%8C%E6%A0%87%E5%BF%97%E7%AE%97%E6%B3%95 "边界标志算法")边界标志算法

在帧缓冲器中对多边形的每条边进行直线扫描转换，即对多边形边界所经过的像素打上标记。

从左到右逐个访问扫描线的像素，进行上色。

边界标志算法更适合硬件实现，这时它的执行速度比有序边表算法快一至两个数量级。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  

void edgemarkFill(polydef, color)  
{  
 对多边形polydef每条边进行直线扫描转换;  
 for (每条与多边形polydef相交的扫描线y)  
 {  
 bool inside = false;  
 for (扫描线上的每个像素x)  
 {  
 if (像素x被打上边标记) inside = !inside;  
 if (inside) drawPixel(x, y, color);  
 else drawPixel(x, y, backgroudColor);  
 }  
 }  
}  

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%BE%B9%E7%BC%98%E5%A1%AB%E5%85%85%E7%AE%97%E6%B3%95 "边缘填充算法")边缘填充算法

一张图：

[![1556802276001](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556802276001.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1556802276001.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%A0%85%E6%A0%8F%E5%A1%AB%E5%85%85%E7%AE%97%E6%B3%95 "栅栏填充算法")栅栏填充算法

对边缘填充算法的改进，栅栏指一条过多边形顶点且与扫描线垂直的直线，它把多边形分为两半。

在处理每条边与扫描线的交点时，将交点与栅栏之间的像素取补。

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%A4%9A%E8%BE%B9%E5%BD%A2%E7%9A%84%E5%8C%BA%E5%9F%9F%E5%A1%AB%E5%85%85 "多边形的区域填充")多边形的区域填充

-   区域：已经表示成点阵形式的填充图形，是像素的集合
    
-   区域填充：指将区域内的一点(常称种子点)赋予给定颜色，然后将这种颜色扩展到整个区域内的过程。
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%8C%BA%E5%9F%9F%E5%A1%AB%E5%85%85%E7%AE%97%E6%B3%95-%E6%B3%9B%E6%BB%A5%E5%A1%AB%E5%85%85%E7%AE%97%E6%B3%95 "区域填充算法(泛滥填充算法)")区域填充算法(泛滥填充算法)

DFS/BFS

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%89%AB%E6%8F%8F%E7%BA%BF%E7%A7%8D%E5%AD%90%E5%A1%AB%E5%85%85%E7%AE%97%E6%B3%95 "扫描线种子填充算法")扫描线种子填充算法

区域填充扫描线方法。上一算法从种子点开始DFS/BFS，其中多次入栈(队)，费时费内存效率不高。实际上知道了一个点，我们可以从该点向左向右循环填充直至碰触边界。扫描线种子填充算法就是用这个结合扫描线，解决了多次入栈(队)的问题。

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  
15  
16  
17  
18  
19  
20  
21  
22  
23  
24  
25  
26  
27  
28  
29  
30  
31  

void ScanLineFill4(int x, int y, Color oldColor, Color newColor)  
{  
 typedef struct{int x,y;} Seed;  
 int xl, xr;  
 bool spanNeedFill;  
 stack<Seed> S;  
 S.push({x, y});  
 while(!S.empty())  
 {  
 Seed u = S.top(); S.pop();  
 x = u.x; y = u.y;  
 for(xr=x;readPixelRGB(xr, y) == oldColor;xr++)  
 drawPixel(xr, y, newColor);  
 xr--;  
 for(xl=x\-1;readPixelRGB(xl, y) == oldColor;xl--)  
 drawPixel(xl, y, newColor);  
 xl++;  

 for(int yy=y\-1;yy<=y+1;yy+=2)  
 {  
 x = xl;  
 while(x <= xr)  
 {  
 spanNeedFill = false;  
 for(;readPixelRGB(x, yy) == oldColor;x++) spanNeedFill = true;  
 if(spanNeedFill) S.push({x\-1, yy});  
 while(readPixelRGB(x, yy)!=oldColor && x<=xr) x++;  
 }  
 }  
 }  
}  

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%89%AB%E6%8F%8F%E8%BD%AC%E6%8D%A2%E4%B8%8E%E5%8C%BA%E5%9F%9F%E5%A1%AB%E5%85%85%E7%9A%84%E4%B8%8D%E5%90%8C "扫描转换与区域填充的不同")扫描转换与区域填充的不同

-   基本思想不同
    -   扫描转换：将多边形顶点转换为点阵表示。
    -   区域填充：只改变区域颜色，不改变区域的表示方法。
-   基本条件不同
    -   扫描转换：从多边形的边界(顶点)信息出发，利用多种形式的连贯性进行填充点阵。
    -   区域填充：给定区域内一点作为种子点，然后从点根据连通性将新的颜色扩散到整个区域。
-   目的不同
    -   扫描转换：知道多边形边界，求多边形内部的像素集。
    -   区域填充：知道边界、区域内一点，内部填色。

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%8F%8D%E8%B5%B0%E6%A0%B7 "反走样")反走样

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%B5%B0%E6%A0%B7%E7%8E%B0%E8%B1%A1 "走样现象")走样现象

-   光栅图形缠身的阶梯型（锯齿形）

[![1557734619560](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557734619560.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557734619560.png)

-   小物体由于走样而消失

[![1557734746397](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557734746397.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557734746397.png)

-   动画序列中时隐时现，产生闪烁（仅在矩形覆盖像素中心时显示）

[![1557734918664](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557734918664.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557734918664.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%8F%8D%E8%B5%B0%E6%A0%B7%E6%8A%80%E6%9C%AF%E5%8E%9F%E7%90%86 "反走样技术原理")反走样技术原理

反走样(Antialiasing)

[![1557737078537](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557737078537.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557737078537.png)

-   提高设备分辨率：由于存储器代价、扫描转换时间代价、轰击屏幕电子枪的速度代价，所以不可取

[![1557735574657](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557735574657.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557735574657.png)

-   模糊：对于白色背景中黑色矩形，在矩形边界掺入灰色像素，柔化从黑到白的尖锐变化。从远处观察图像，人眼把这些缓和变化的暗影融合在一起，从而看到更平滑的边界。
    
    [![1557735786217](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557735786217.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557735786217.png)
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E9%9D%9E%E5%8A%A0%E6%9D%83%E5%8C%BA%E5%9F%9F%E9%87%87%E6%A0%B7%E6%96%B9%E6%B3%95 "非加权区域采样方法")非加权区域采样方法

方法：根据物体的覆盖率（某个像素区域被物体覆盖的比例）计算像素的颜色。

[![1557736273466](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557736273466.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557736273466.png)

两个缺点：

-   像素亮度与相交区域面积成正比，而与相交区域在像素内的位置无关 -> 仍有锯齿效应
    
-   直线条上沿理想直线方向的相邻两个象素有时会有较大的灰度差（因为每个像素的权值都一样）
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%8A%A0%E6%9D%83%E5%8C%BA%E5%9F%9F%E9%87%87%E6%A0%B7%E6%96%B9%E6%B3%95 "加权区域采样方法")加权区域采样方法

在加权方法中，将像素亮度与相交区域在像素内的位置看作有关。

思想：直线段对一个像素亮度的贡献正比于相交区域与像素中心的距离 d

[![1557736675852](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557736675852.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557736675852.png)

方法：设置相交区域面积与像素中心距离的权函数（高斯函数）反映相交面积对整个像素亮度的贡献大小，利用权函数积分求相交区域面积，再乘以最大亮度值即为像素实际亮度值。

简化方案：将积分改为离散计算

[![1557737269895](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557737269895.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557737269895.png)

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%9B%B4%E7%BA%BF%E8%A3%81%E5%89%AA%E7%AE%97%E6%B3%95 "直线裁剪算法")直线裁剪算法

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%A3%81%E5%89%AA "裁剪")裁剪

裁剪：确定图形哪些部分落于显示区之内/外。

最简单的剪裁：转换为点的剪裁

点的剪裁：判断 {xleft≤x≤xright ybottom≤y≤ytop

直线段的剪裁：判断 {完全落在窗口内 完全落在窗口外 与窗口边界相交

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Cohen-Sutherland%E7%AE%97%E6%B3%95 "Cohen-Sutherland算法")Cohen-Sutherland算法

又称编码裁剪算法。

思想：对每条直线段分是三种情况

-   若点 p1 和 p2 完全在剪裁窗口内：取之
-   若点为下图四种之一：弃之

[![1557738683086](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557738683086.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557738683086.png)

-   其他情况，可以采用编码的方法：顶点编码D3D2D1D0， {D0\=x<xleft D1\=x\>xright D2\=y<ybottom D3\=y\>ytop 
    -   若 p1 | p2\=0，取之
    -   若 p1 \\ &\\ p2 \\not= 0 ，丢之
    -   若上述都不满足，则**依次按左、右、上、下的顺序**求出线段与窗口的交点。  
        然后在交点处把线段一分为二，根据上述两个原则舍/取一部分。

[![1557738830653](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557738830653.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557738830653.png)

特点

-   较适合两种情况——大部分线可见、大部分线不可见。
    
-   存在问题：下图线段要多次经过算交点才会被舍弃。
    
    [![1557743068830](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557743068830.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557743068830.png)
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%B8%AD%E7%82%B9%E5%88%86%E5%89%B2%E7%AE%97%E6%B3%95 "中点分割算法")中点分割算法

与Cohen-Sutherland算法相似，需要对位置进行编码。

思想：通过**二分逼近**来确定线段与窗口的交点

-   完全在窗口内/外的情况
    
-   和窗口有交点，构建线段中点
    
    -   若中点在窗口内，则不断构建交点与端点的中点
        
        [![1557743446302](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557743446302.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557743446302.png)
        
    -   若中点在窗口外，则把 (中点, 离窗口边界较远的端点) 部分去掉。
        
    
    [![1557743506141](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557743506141.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557743506141.png)
    
    -   以此逼近。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Liang-Barsky%E7%AE%97%E6%B3%95 "Liang-Barsky算法")Liang-Barsky算法

线段 (x1,y1)→(x2,y2)

特判：

-   若 x1\=x2，判断 x1−xleft<0 或 xright−x1<0 则线段不在窗口内
-   若 y1\=y2，判断 y1−ybottom<0 或 ytop−y1<0 则线段不在窗口内

思想：

-   用参数方程表示直线段 {x\=x1+u·(x2−x1)\=x1+u·Δx y\=y1+u·(y2−y1)\=y1+u·Δy，0≤u≤1
    
-   将直线段看成一条有方向的线段（标记端点为绿色），把窗口的四条边及其延长线分成入边、出边两种。
    
    -   入边：直线由窗口**外向内**移动时和窗口边界相交的边（标记交点为红色）
    -   出边：直线由窗口**内向外**移动时和窗口边界相交的边（标记交点为红色）
    
    [![1557744279100](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557744279100.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557744279100.png)
    
    -   用 u1、u2 分别表示线段 (u1≤u2) 可见部分的开始和结束 {u1\=max(0,uleft,ubottom) u2\=min(1,utop,uright)
    
    [![1557744846784](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557744846784.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557744846784.png)
    

问题：

-   问题1.如何判断哪两个边是入边，哪两个边是出边
    
-   问题2.直线和窗口边界线四个交点参数 u 值如何求出
    
-   将裁剪转换为不等式：{xleft≤x1+u·Δx≤xright ybottom≤y1+u·Δy≤ytop⇒{u·(−Δx)≤x1−xleft u·Δx≤xright−x1 u·(−Δy)≤y1−ybottom u·Δy≤ytop−y1 
    
    将上面不等式看作 u·pk≤qk，四个不等式参数意义一一对应。当不等式取等号时， u\=qkpk即为直线和窗口四条边交点处的参数。（问题 2 解决）
    
    除此之外，对于问题 1 的解决，根据 pk 的符号判断：
    
    [![1557747467656](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557747467656.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557747467656.png)
    

故，u1、u2 进一步得到为 {u1\=max(0,uk|pk<0,uk|pk<0) u2\=min(1,uk|pk\>0,uk|pk\>0)，若 u1\>u2 则在窗口外。

例子：

[![1557748368458](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557748368458.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1557748368458.png)

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%A4%9A%E8%BE%B9%E5%BD%A2%E8%A3%81%E5%89%AA "多边形裁剪")多边形裁剪

一个简单的想法：多边形裁剪转换为直线的裁剪，然而会得到一些不连续直线段。

[![1558339530111](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558339530111.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558339530111.png)

然而目标却是：多边形边界的顶点序列

[![1558339588036](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558339588036.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558339588036.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Sutherland-Hodgeman%E5%A4%9A%E8%BE%B9%E5%BD%A2%E8%A3%81%E5%89%AA "Sutherland-Hodgeman多边形裁剪")Sutherland-Hodgeman多边形裁剪

算法思想：

-   将多边形边界作为一个整体
-   每次用窗口的一条边对 被裁剪的多边形、中间结果多边形 进行裁剪（分治）

[![1558340325531](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558340325531.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558340325531.png)

顶点的舍取——以下图左边界裁剪多边形123456为例，考虑四种情况：

-   都在不可见侧：都不加入。例如边12都不加入
-   源S在不可见侧，目标T在可见侧：加入交点、T。例如边23加入2 ‘ 3
-   都在可见侧：只加入目标T。例如边34加入4
-   源S在可见侧，目标T在不可见侧：加入源点、交点。例如边56加入56’

[![1558340618583](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558340618583.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558340618583.png)

算法缺点：

-   对凹多边形可能会得到多余线段

[![1558340958109](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558340958109.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558340958109.png)

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%96%87%E5%AD%97%E8%A3%81%E5%89%AA "文字裁剪")文字裁剪

文字裁剪分类：

-   串精度裁剪：仅保留字符串全在窗口内的串

[![1558341126387](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341126387.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341126387.png)

-   字符精度裁剪：仅保留字符全在窗口内的字符

[![1558341168278](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341168278.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341168278.png)

-   笔划/像素精度裁剪：仅保留字符像素(笔画)在窗口内的部分

[![1558341221436](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341221436.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341221436.png)

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%B6%88%E9%9A%90%E7%AE%97%E6%B3%95 "消隐算法")消隐算法

消隐：绘制时消除被遮挡的不可见的线或面，也称消除隐藏线和隐藏面。

[![1558341507888](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341507888.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341507888.png)

[![1558341582016](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341582016.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558341582016.png)

消除隐藏线、隐藏面，这里介绍的主要算法：

-   Z缓冲区(Z-Buffer)算法
-   扫描线Z-buffer算法
-   区域子分割算法

消隐的分类：

-   按消隐对象分
    -   线消隐
    -   面消隐
-   按消隐空间分
    -   物体空间：将场景中的 1 个物体与剩下的 n-1 个物体逐一比较，仅显示可见表面（常用线段图的消隐）
    -   **图像空间**：对屏幕窗口内的每个像素判断

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%94%BB%E5%AE%B6%E7%AE%97%E6%B3%95 "画家算法")画家算法

比较简单的想法：先画远的物体，再画近的物体，近物体会覆盖远物体。

只能解决简单情况。

[![1558342005389](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558342005389.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558342005389.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Z%E7%BC%93%E5%86%B2%E5%8C%BA-Z-Buffer-%E7%AE%97%E6%B3%95 "Z缓冲区(Z-Buffer)算法")Z缓冲区(Z-Buffer)算法

能跟踪屏幕上每个像素的深度。

维护两个数组：

-   帧缓冲器，Intensity(x, y)——属性数组，图像空间每个可见像素的光强/颜色
    
-   深度缓冲区，Depth(x, y)——深度数组，图像空间每个可见像素的 z 坐标
    

[![1558342314960](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558342314960.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558342314960.png)

算法思想：

-   将 Z 缓冲器中各单元的初始值置为最小值
-   当要改变某个像素的颜色值时，仅在当前 z 值大于原来 z 值时，才替换

算法优点：

-   简单、直观
-   在像素级上以近物取代远物，而与物体的出现顺序无关，利于硬件实现
-   内存容量不再是问题后，变得受欢迎

算法缺点：

-   占用空间大
-   没有利用图形的相关性和连续性，这是严重缺陷
-   像素级的算法，效率低

算法改进——改进占用空间（去数组，时间换空间）：

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  

void Z-Buffer()  
{   
 帧缓存全置为背景色  
 for(屏幕上的每个像素(i,j))  
 {  
 深度缓存遍历 zb = -INF;  
 for(多面体上的每个多边形P\_k)  
 if(像素点(i,j)在P\_k的投影在多边形内 && P\_k的depth(i,j)>zb)  
 zb = depth(i,j), indexp = k;  
 if(zb != -INF)   
 计算P\_indexp在(i, j)的光照颜色并显示  
 }  
}  

-   面的深度计算：ax+by+cz+d\=0⇒depth\=−ai+bj+dc
    
-   点与多边形的包含性
    
    -   射线法，缺点是计算量大、有误差不稳定
        
        [![1558343490086](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558343490086.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558343490086.png)
        
    -   弧长法，缺点是算弧长效率低
        
        [![1558343734873](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558343734873.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558343734873.png)
        
    -   以顶点符号为基础的弧长累加法
        
        [![1558344174810](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558344174810.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558344174810.png)
    
-   该改进未解决像素级算法的本质，效率仍然低。
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%8C%BA%E9%97%B4%E6%89%AB%E6%8F%8F%E7%BA%BF%E7%AE%97%E6%B3%95 "区间扫描线算法")区间扫描线算法

考虑Z-Buffer没有利用图形的相关性和连续性的缺陷，该算法放弃了Z-Buffer的思想（一个像素可能被多个多边形覆盖，即一个像素要多次判别，效率极低），是消隐算法中最快的算法之一。

思想：

-   把扫描线和多边形的这些交点都求出来，对每个区间，只判一个像素的颜色，那么整个区间都是该颜色
-   像素计算 -> 逐段计算，效率大大提高。

[![1558350237847](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558350237847.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558350237847.png)

确定小区间的颜色：

-   小区间无任何多边形，如\[a4, a5\]，用背景色显示
-   小区间仅有一多边形，如\[a1, a2\]，显示该多边形颜色
-   小区间存在两个以上多边形，如\[a6, a7\]，用深度检测

问题：

-   真实求交点？
    -   不用，利用增量算法简化求交
-   每段区间上要求 z 值最大的面，如何得知区间与哪些多边形相关
    -   利用扫描线的两个特殊数据结构？？？

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Warnock%E6%B6%88%E9%9A%90%E7%AE%97%E6%B3%95 "Warnock消隐算法")Warnock消隐算法

区域子分割算法，发明人Warnock，图像空间中非常经典的算法，其重要性不体现在其效率，而是体现在分治思想和堆栈数据结构的运用。

思想：

-   把物体投影到全屏幕窗口
-   递归分割窗口，直到窗口内目标足够简单（可以显示）

[![1558351906311](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558351906311.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558351906311.png)

如何判断窗口内图形足够简单：

[![1558351029861](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558351029861.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558351029861.png)

1.  仅包含一个多边形，即**内含**

[![1558351097414](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558351097414.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558351097414.png)

2.  窗口与一个多边形**相交**，但窗口内无其他多边形（用直线方程作判别函数）
    
3.  窗口被一个多边形所**包围**
    
4.  窗口与一个多边形相**分离**
    

[![1558351086277](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558351086277.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1558351086277.png)

5.  若窗口仅像素那么大，但仍有两个以上的面，则不必再分割，取窗口内最近的可见面颜色或所有可见面平均颜色。

## [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AC%AC3%E7%AB%A0-%E4%BA%8C%E7%BB%B4%E5%9B%BE%E5%BD%A2%E5%87%A0%E4%BD%95%E5%8F%98%E6%8D%A2 "第3章 二维图形几何变换")第3章 二维图形几何变换

本章内容：

-   主要：向量、世界坐标系、用户坐标系、窗口与视区、齐次坐标、二维变换
-   向量、矩阵以及它们的运算
-   坐标系的概念和坐标系之间的变换 齐次坐标的概念
-   二维图形的各种变换
-   窗口与视区的变换

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%90%91%E9%87%8F%E5%9F%BA%E7%A1%80 "向量基础")向量基础

图形学中，处理三维物体，在意绘制对象的形状、位置、方向。

两大基本工具：向量分析、图形变换

向量：点和方向的实体（没有位置）

向量两种特殊线性组合（w\=a1v1+a2v2+…+anvn）：

-   仿射组合：线性组合的系数和等于 1，∑i\=1nai\=1
-   凸组合：线性组合的系数和等于 1，且各系数非负，∑i\=1nai\=1（ai≥0）

向量的运算，a\=(a1,a2)，b\=(b1,b2)：

-   相加
-   数乘
-   点积：a·b\=a1b1+a2b2\=|a||b|cos⟨a,b⟩，用向量描述新闻，新闻相似，则向量夹角余弦接近于 1
-   叉积：a\=(ax,ay,az)，b\=(bx,by,bz)，a×b\=|ijk axayaz bxbybz|\=|a||b|sin⟨a,b⟩

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9B%BE%E5%BD%A2%E5%9D%90%E6%A0%87%E7%B3%BB "图形坐标系")图形坐标系

坐标系：建立图形和数之间对应联系的参考系

数学坐标系分类：

-   直角坐标系
-   极坐标系
-   圆柱坐标系
-   球坐标系

计算机图形学坐标系分类：

-   世界坐标系：公共坐标系，现实中物体或场景的统一参照系
    
-   建模坐标系：又称局部坐标系，每个物体(对象)有它自己的局部中心和坐标系
    
-   观察坐标系：依据观察窗口的方向和形状在世界坐标系中定义的坐标系。观察坐标系用于指定图形的输出范围。
    
-   设备坐标系：屏幕坐标，坐标单位是整数
    
-   规范化坐标系：归一化后的坐标，坐标轴取值范围 0~1，
    

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%BA%8C%E7%BB%B4%E5%9B%BE%E5%BD%A2%E5%8F%98%E6%8D%A2%E5%8E%9F%E7%90%86 "二维图形变换原理")二维图形变换原理

变换：比例、旋转、镜像、错切、平移

对于一个图形，可用顶点表描述图形的几何关系，用连边表来描述图形的拓扑关系。故对图形的变换，只变换图形的顶点表

仿射变换：

-   Affine Transformation
    
-   平直性：直线变换后仍是直线
    
-   平行性：平行线变换后仍平行
    
-   二维仿射变换： {x‘\=a1x+b1y+c1 y‘\=a2x+b2y+c2
    
-   二维仿射变换，矩阵形式：\[x∗y∗\]\=\[xy1\]·\[a1a2 b1b2 c1c2\]
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E9%BD%90%E6%AC%A1%E5%9D%90%E6%A0%87 "齐次坐标")齐次坐标

-   二维平面中用(x, y)表示一个点，不妨说是一个向量(x, y)表示一个点。所以可以用第3维为常数的(x, y, 1)表示二维平面上的向量
    
-   这种n+1维表示n维的方法称为——齐次坐标表示法，n维向量 (p1,p2,⋯,pn) 表示为 (hp1,hp2,⋯,hpn,h)，其中 h 称为哑坐标，特别的 h=1 时称齐次坐标为规格化坐标。
    
-   二维仿射变换，齐次坐标表示：\[x∗y∗1\]\=\[xy1\]·\[a1a20 b1b20 c1c21\]
    
-   不使用齐次坐标可以做比例、对称、旋转变换，但做不到平移变化，无法增加常数项。
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%B9%B3%E7%A7%BB%E5%8F%98%E6%8D%A2 "平移变换")平移变换

-   不产生变形而移动物体的**刚体变换**，即物体上的每个点移动相同数量的坐标
    
-   坐标形式：{x∗\=x+Tx y∗\=y+Ty
    
-   齐次坐标形式：\[x∗y∗1\]\=\[xy1\]·\[100 010 TxTy1\]
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%AF%94%E4%BE%8B%E5%8F%98%E6%8D%A2 "比例变换")比例变换

-   相对于坐标原点沿x方向放缩Sx倍，沿y方向放缩Sy倍。S > 1放大，S < 1 缩小。
-   坐标形式：{x∗\=x·Sx y∗\=y·Sy
-   齐次坐标形式：\[x∗y∗1\]\=\[xy1\]·\[Sx00 0Sy0 001\]\=\[x·Sxy·Sy1\]
-   当 Sx\=Sy 时，为整体比例变换，\[x∗y∗1\]\=\[xy1\]·\[100 010 00S\]\=\[xSyS1\]，S>1缩小，0<S<1缩小，S<0发生关于原点的对称等比变换

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%AF%B9%E7%A7%B0%E5%8F%98%E6%8D%A2 "对称变换")对称变换

-   也称镜像变换。有关于x轴、y轴、原点、某条直线的对称变换
-   关于 x 轴对称：\[x∗y∗1\]\=\[xy1\]·\[100 0−10 001\]\=\[x−y1\]
-   关于 y 轴对称：\[x∗y∗1\]\=\[xy1\]·\[−100 010 001\]\=\[−xy1\]
-   关于原点对称：\[x∗y∗1\]\=\[xy1\]·\[−100 0−10 001\]\=\[−x−y1\]

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%97%8B%E8%BD%AC%E5%8F%98%E6%8D%A2 "旋转变换")旋转变换

-   将点绕原点旋转角度 θ ，逆时针为正，顺时针为负
    
-   坐标形式（逆时针）：{x∗\=r·cos(α+θ)\=r·cosα·cosθ−r·sinα·sinθ y∗\=r·sin(α+θ)\=r·cosα·sinθ+r·sinα·cosθ⇒{x∗\=x·cosθ−y·sinθ y∗\=x·sinθ+y·cosθ
    
-   齐次坐标形式（逆时针）：\[x∗y∗1\]\=\[xy1\]·\[cosθsinθ0 −sinθcosθ0 001\]\=\[x·cosθ−y·sinθx·sinθ+y·cos1\]
    
-   顺时针只要将 θ\=−θ 即可。
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E9%94%99%E5%88%87%E5%8F%98%E6%8D%A2 "错切变换")错切变换

-   弹性物体的变形处理

[![1559033084287](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559033084287.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559033084287.png)

-   变换矩阵中的非对角元素起着把图形沿x或y方向错切的作用
-   齐次坐标形式：\[x∗y∗1\]\=\[xy1\]·\[1b0 c10 001\]\=\[c+cybx+y1\]
-   沿 x 方向错切，即 b=0 ：\[x∗y∗1\]\=\[xy1\]·\[100 c10 001\]\=\[c+cyy1\]

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%A4%8D%E5%90%88%E5%8F%98%E6%8D%A2 "复合变换")复合变换

-   图形作大于一次的变换，P∗\=P·T\=P·(T1·T2·⋯·Tn)，n\>1，**矩阵相乘**不可交换！
    
-   二维复合平移：T\=Tt1·Tt2\=\[100 010 Tx1Ty11\]·\[100 010 Tx1Ty11\]\=\[100 010 Tx1+Tx2Ty1+Ty21\]
    
-   二维复合比例：T\=Ts1·Ts2\=\[Sx100 0Sy10 001\]·\[Sx200 0Sy20 001\]\=−C\[Sx1·Sx200 0Sy1·Sy20 001\]
    
-   二维复合旋转：T\=Tr1·Tr2\=\[cosθ1sinθ10 −sinθ1cosθ10 001\]·\[cosθ2sinθ20 −sinθ2cosθ20 001\]\=\[cos(θ1+θ2)sin(θ1+θ2)0 −sin(θ1+θ2)cos(θ1+θ2)0 001\]
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9D%90%E6%A0%87%E7%B3%BB%E5%8F%98%E6%8D%A2 "坐标系变换")坐标系变换

-   图形变换经常需要从一个坐标系变换到另一个坐标系，如下图从x0y变换到x ‘ 0 ‘ y ‘

[![1559034067979](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559034067979.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559034067979.png)

-   上图可以拆分成，x‘0‘y‘→平移x‘0y‘→旋转x0y，注意是从目标到源
-   T\=Tt·Tr\=\[100 010 −x0−y01\]·\[cos(−θ)sin(−θ)0 −sin(−θ)cos(−θ)0 001\]

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%BB%BB%E6%84%8F%E5%8F%82%E8%80%83%E7%82%B9%E7%9A%84%E5%87%A0%E4%BD%95%E5%8F%98%E6%8D%A2 "任意参考点的几何变换")任意参考点的几何变换

-   在以往的变换中，以 (0, 0) 为参考点，倘若以任意点为参考点，则：
    -   将参考点移到原点（平移）
    -   针对原点进行二维几何变换（变换）
    -   将原点移到参考点（反平移）

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%BA%8C%E7%BB%B4%E5%8F%98%E6%8D%A2%E7%9F%A9%E9%98%B5 "二维变换矩阵")二维变换矩阵

-   二维空间中某点的变化可以表示成点的齐次坐标与 3 阶的二维变换矩阵 T2d 相乘
    
    \[x∗y∗1\]\=\[xy1\]·\[abp cdq lms\]
    
-   [![1559035081804](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035081804.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035081804.png)
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%BA%8C%E7%BB%B4%E5%9B%BE%E5%BD%A2%E5%87%A0%E4%BD%95%E5%8F%98%E6%8D%A2%E7%9A%84%E8%AE%A1%E7%AE%97 "二维图形几何变换的计算")二维图形几何变换的计算

-   点的变换：\[x∗y∗1\]\=\[xy1\]·T
    
-   直线的变换（两端点的变换）：\[x1∗y1∗1 x2∗y2∗1\]\=\[x1y11 x2y21\]·T
    
-   多边形的变换（每个顶点的变换）：p\=\[x1∗y1∗1 x2∗y2∗1 ⋯⋯⋯ xn∗yn∗1\]
    

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AA%97%E5%8F%A3%E3%80%81%E8%A7%86%E5%9B%BE%E5%8F%8A%E5%8F%98%E6%8D%A2 "窗口、视图及变换")窗口、视图及变换

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AA%97%E5%8F%A3%E5%92%8C%E8%A7%86%E5%8C%BA "窗口和视区")窗口和视区

-   窗口：世界坐标系中要显示的区域
    
-   视区：窗口映射到显示器上的区域
    
-   窗口定义显示什么；视区定义在何处显示
    
    [![1559035457686](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035457686.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035457686.png)
    
-   世界坐标系中的一个窗口可以对应于多个视区
    

[![1559035487387](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035487387.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035487387.png)

-   窗口→观察变换视区

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%A7%82%E5%AF%9F%E5%8F%98%E6%8D%A2 "观察变换")观察变换

-   Viewing Transformation
    
-   变焦距效果
    
    -   窗口放大/缩小，视区不变，图形缩小/放大
    
    [![1559035899696](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035899696.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035899696.png)
    
-   整体缩放效果
    
    -   窗口不变，视区放大/缩小，图形放大/缩小
    
    [![1559035942154](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035942154.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559035942154.png)
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AA%97%E5%8F%A3%E5%88%B0%E8%A7%86%E5%8C%BA%E7%9A%84%E5%8F%98%E6%8D%A2 "窗口到视区的变换")窗口到视区的变换

-   窗口的点 -> 视区的点

[![1559036093678](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559036093678.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559036093678.png)

-   保持比例的映射
    -   {sx\=A×x+C sy\=B×y+D
    -   比例保持：x−wxlwxr−wxl\=sx−vxlvxr−vxl⇒sx\=x−wxlwxr−wxl(vxr−vxl)+vxl
    -   根据倍数关系：sx\=vxr−vxlwxr−wxlx+(vxl−vxr−vxlwxr−wxlwxl)\=Ax+C， A\=vxr−vxlwxr−wxl，C\=vxl−A×wxl
    -   同理，B\=vyt−vybwyt−wyb，D\=vyb−B×wyb

## [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AC%AC4%E7%AB%A0-%E4%B8%89%E7%BB%B4%E5%9B%BE%E5%BD%A2%E5%87%A0%E4%BD%95%E5%8F%98%E6%8D%A2 "第4章 三维图形几何变换")第4章 三维图形几何变换

主要关注：

-   如何对三维物体进行方向、尺寸、形状的变换
-   三维物体在二维输出
-   变换有两种：几何变换、投影变换

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%B8%89%E7%BB%B4%E5%87%A0%E4%BD%95%E5%8F%98%E6%8D%A2 "三维几何变换")三维几何变换

三维基本几何变换皆是相对于坐标原点和坐标轴进行的几何变换。

-   p‘\=\[x∗y∗z∗1\]\=\[xyz1\]·\[abcp defq ghir lmns\]

[![1559044604537](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559044604537.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559044604537.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%B9%B3%E7%A7%BB%E5%8F%98%E6%8D%A2-1 "平移变换")平移变换

-   \[xyz1\]·\[1000 0100 0010 TxTyTz1\]\=\[x+Txy+Tyz+Tz1\]

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%AF%94%E4%BE%8B%E5%8F%98%E6%8D%A2-1 "比例变换")比例变换

-   局部比例变换：\[xyz1\]·\[a000 0e00 00i0 0001\]\=\[axeyiz1\]
-   整体比例变换：\[xyz1\]·\[1000 0100 0010 000s\]\=\[xsyszs1\]

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%97%8B%E8%BD%AC%E5%8F%98%E6%8D%A2-1 "旋转变换")旋转变换

-   右手定则：右手大拇指指向旋转轴的正向，其余四指指向旋转角的正向

[![1559045122619](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559045122619.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559045122619.png)

-   绕 z 轴旋转：\[xyz1\]·\[cosθsinθ00 −sinθcosθ00 0010 0001\]\=\[x·cosθ−y·sinθx·sinθ+y·cosθz1\]
    
-   绕 x 轴旋转：\[xyz1\]·\[1000 0cosθsinθ0 0−sinθcosθ0 0001\]\=\[xy·cosθ−z·sinθy·sinθ+z·cosθ1\]
    
-   绕 y 轴旋转：\[xyz1\]·\[cosθ0−sinθ0 0100 sinθ0cosθ0 0001\]\=\[x·sinθ+x·cosθyz·cosθ−x·sinθ1\]
-   绕任意轴旋转：

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%AF%B9%E7%A7%B0%E5%8F%98%E6%8D%A2-1 "对称变换")对称变换

-   关于坐标平面的对称
    -   关于 x0y 平面对称：T\=\[1000 0100 00−10 0001\]
    -   关于 y0z 平面对称：T\=\[−1000 0100 0010 0001\]
    -   关于 z0x 平面对称：T\=\[1000 0−100 0010 0001\]
-   关于坐标轴的对称
    -   关于 x 轴对称：T\=\[1000 0−100 00−10 0001\]
    -   关于 x 轴对称：T\=\[−1000 0100 00−10 0001\]
    -   关于 z 轴对称：T\=\[−1000 0−100 0010 0001\]

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%B8%89%E7%BB%B4%E6%8A%95%E5%BD%B1%E5%8F%98%E6%8D%A2 "三维投影变换")三维投影变换

解决三维输出到二维

投影法分类（区别在于投影中心道投影面之间的距离是有/无限的）：

[![1559047018319](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559047018319.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559047018319.png)

-   透视投影法（中心投影法），比如建筑透视
    -   表示真实看到的物体
-   平行投影法
    -   正投影法，比如工程样图
    -   斜投影法
    -   表示真实大小和形状的物体

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%B9%B3%E8%A1%8C%E6%8A%95%E5%BD%B1 "平行投影")平行投影

特点：

-   物体各个面的精确视图又平行投影而得
-   没有给出三维物体外表的真实性但保持比例

[![1559047046295](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559047046295.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559047046295.png)

正投影 之 三视图：

[![1559047352925](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559047352925.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559047352925.png)

-   主视图变换矩阵
    -   T\=\[1000 0000 0010 0001\]
-   俯视图变换矩阵
    -   T\=\[1000 00−10 0000 00−z01\]
        -   直接置 y=0，T\=\[1000 0100 0000 0001\]
        -   为了使俯视图与主视图都画在一个平面内，就要使H面绕x轴顺时针转90°，T\=\[1000 0cos(−90∘)sin(−90∘)0 0−sin(−90∘)cos(−90∘)0 0001\]\=\[1000 00−10 0100 0001\]
        -   为了使主视图和俯视图有一定的间距，还要使H面沿z方向平移一段距离 −z0 ，T\=\[1000 0100 0010 00−z01\]
-   侧视图变换矩阵
    -   T\=\[0000 −1000 0010 −x0001\]
        -   直接置 y=0，T\=\[0000 0100 0010 0001\]
        -   为了使侧视图与主视图也在一个平面内，就要使W面绕z轴正转90°，T\=\[cos(−90∘)sin(−90∘)00 −sin(−90∘)cos(−90∘)00 0010 0001\]\=\[0100 −1000 0010 0001\]
        -   为使主视图和侧视图有一定的间距，还要使W面沿负x方向平移一段距离−x0，T\=\[1000 0100 0010 −x0001\]
-   主视图： \[x‘y‘z‘1\]\=\[x0z1\]
-   俯视图： \[x‘y‘z‘1\]\=\[x0−(y+z0)1\]
-   侧视图： \[x‘y‘z‘1\]\=\[−(y+x0)0z1\]
-   三个视图中的y’均为0，表明三个视图均落在xOz面上

正投影 之 正轴侧：

-   等轴侧：当投影面与三个坐标轴之间的夹角都相等
-   正二测：当投影面与两个坐标轴之间的夹角相等
-   正三测：当投影面与三个坐标轴之间的夹角都不相等

[![1559551088678](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559551088678.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559551088678.png)

[![1559551159470](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559551159470.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559551159470.png)

正投影 之 正轴侧变换矩阵：

-   以 V 面为轴测投影面，先将物体绕 Z 轴转 γ 角，接着绕X轴转 -α 角，最后向 V 面投影
    
    [![1559551322005](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559551322005.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559551322005.png)
    
-   T正\=TZ·TX·TV\=\[cosγsinγ00 −sinγcosγ00 0010 0001\]·\[1000 0cosα−sinα0 0sinαcosα0 0001\]·\[1000 0000 0010 0001\] \=\[cosγ0−sinγsinα0 −sinγ0−cosγsinα0 00cosα0 0001\]
    
-   即 \[x‘y‘z‘1\]\=\[xcosγ−ysinγ0−xsinγsinα−ycosγsinα+zcosα1\]
    
-   正等轴测图：取 γ\=45∘，α\=−35.26∘，T正等轴测\=\[0.70710−0.40820 −0.70710−0.40820 000.81650 0001\]
    
-   正二测图：取 γ\=20.7∘，α\=19.47∘，T正二测\=\[0.93540−0.11780 −0.70710−0.31180 000.94280 0001\]
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E4%B8%AD%E5%BF%83%E6%8A%95%E5%BD%B1-%E9%80%8F%E8%A7%86%E6%8A%95%E5%BD%B1 "中心投影(透视投影)")中心投影(透视投影)

特点：

-   物体投影视图由计算投影线与观察平面之交点而得
-   生成真实感视图但不保持比例

[![1559046811865](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559046811865.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559046811865.png)

-   三维变换矩阵，T3D\=\[abcp defq ghir lmns\]，其中 p、q、r 能产生透视变换的效果。

[![1559552205924](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559552205924.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559552205924.png)

一点透视：

-   假设 q≠0，p\=r\=0
-   \[xyz1\]·\[1000 010q 0010 0001\]\=\[xyzqy+1\]
-   齐次化后：\[x‘y‘z‘1\]\=\[xqy+1yqy+1zqy+11\]
    -   当y=0时，\[x‘y‘z‘1\]\=\[x0z1\]，即处于 y=0 平面内的点变换后无变化
    -   当y->∞时，\[x‘y‘z‘1\]\=\[01q01\]，所有点都集中到y轴的1/q处，这点叫**灭点**

[![1559552761561](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559552761561.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559552761561.png)

-   形成灭点的透视变换即为一点透视。
-   同样的分别假设 p、r 其中一个不为 0 ，另外两个为 0 ，都会产生灭点(1/p, 0, 0)、(0, 0, 1/r)。

多点透视：

-   根据一点透视的原理予以推广，如果p、q、r三个元素中有两个为非零元素时，将会生成两个灭点，因此得到两点透视；相应的三点透视概念也可得知。
    -   如当 p≠0，r≠0，\[xyz1\]·\[1000 010q 0010 0001\]\=\[xyzpx+rz+1\]
    -   齐次化后：\[x‘y‘z‘1\]\=\[xpx+rz+1ypx+rz+1zpx+rz+11\]
    -   分别看到两个灭点，(1/p, 0, 0)、(0, 0, 1/r)

[![1559552978511](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559552978511.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559552978511.png)

生成透视投影图的方法：

[![1559553468238](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559553468238.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559553468238.png)

-   设投影中心：c(0, 0, -d)，现在推空间一点 p(x, y, z) 的透视投影点 p ‘ (x ‘ , y ‘ , z ‘ )
-   △ABC∼△A‘OC⇒x‘x\=y‘y\=dd+z⇒x‘\=x1+z/d，y‘\=y1+z/d，z‘\=0
-   矩阵形式是：\[xyz1\]·\[1000 0100 0011d 0001\]\=\[xyzzd+1\]
    -   透视坐标与z值成反比。即z值越大，透视坐标值越小
    -   d的取值不同，可以对形成的透视图有放大和缩小的功能。当值较大时，形成的透视图变大；反之缩小。
-   再乘以向投影面投影的变换矩阵，就得到点在画面上的投影\[xyz1\]·\[1000 0100 0011d 0001\]·\[1000 0100 0000 0001\]
    -   若投影中心在无穷远处，则 1/d -> 0，上式变为平行投影

一点透视投影实例：

[![1559554190675](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559554190675.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559554190675.png)

-   设 l=-0.8, m=-1.6, n=-2, 视距 d=-2.5

[![1559554489679](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559554489679.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559554489679.png)

二点透视投影实例：

[![1559554591054](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559554591054.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559554591054.png)

-   [![1559554650113](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559554650113.png)
    
    1559554650113
    
    ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559554650113.png)
    -   将物体平移到适当位置l、m、n
    -   将物体绕y轴旋转θ角
    -   进行透视变换
    -   最后向xoy面做正投影，即得二点透视图

## [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AC%AC5%E7%AB%A0-%E6%9B%B2%E7%BA%BF%E6%9B%B2%E9%9D%A2 "第5章 曲线曲面")第5章 曲线曲面

描述物体的三维模型：

-   线框模型：顶点和棱边
-   曲面模型：只描述物体表面和表面的连接关系，不描述物体内部的点属性
-   实体模型：不但有物体的外观而且也有物体内点的描述

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%9B%B2%E7%BA%BF%E6%9B%B2%E9%9D%A2%E5%9F%BA%E7%A1%80 "曲线曲面基础")曲线曲面基础

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%9B%B2%E7%BA%BF%E6%9B%B2%E9%9D%A2%E7%9A%84%E9%9D%9E%E5%8F%82%E6%95%B0%E8%A1%A8%E7%A4%BA "曲线曲面的非参数表示")曲线曲面的非参数表示

分为显/隐式

-   显式表示，y = f(x)，x -> y 一一对应，故不能表示封闭或多值曲线
-   隐式表示，f(x, y)=0，优点是容易判断点是否在曲线上
-   显/隐式表示存在的问题
    -   与坐标轴相关
    -   用隐函数表示不直观，作图不方便
    -   用显函数表示存在多值性
    -   会出现斜率为无穷大的情形

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%9B%B2%E7%BA%BF%E6%9B%B2%E9%9D%A2%E7%9A%84%E5%8F%82%E6%95%B0%E8%A1%A8%E7%A4%BA "曲线曲面的参数表示")曲线曲面的参数表示

为了克服非参数表示的问题

-   p(t) = \[x(t), y(t)\]、p(t) = \[x(t), y(t), z(t)\]，等价于笛卡尔分量表示是p(t) = x(t)i + y(t)j + z(t)k
-   归一化表示：t‘\=t−ab−a（a≤t≤b）⇒p(t)（t∈\[0,1\]）
-   曲面则可表示为双参数：p(u,v)\=p(x(u,v),y(u,v),z(u,v))，(u,v)∈\[0,1\]×\[0,1\]

优势：

-   可以满足几何不变性的要求。即形状的数学表示及其所表达的形状不随所取坐标系而改变的性质
-   更大的自由度来控制曲线、曲面的形状，y\=ax3+bx2+cx+d→p(t)\=\[a1t3+b1t2+c1t+d1 a2t3+b2t2+c2t+d2\]，有8个系数来控制曲线。
-   直接对参数方程进行几何变换：对非参数方程表示的曲线、曲面进行变换，必须对曲线 、曲面上的每个型值点进行几何变换；而对参数表示的曲线、曲面可对其参数方程直接进行几何变换
-   便于处理斜率为无穷大的情形，不会因此而中断计算
-   界定曲线、曲面的范围十分简单：t∈\[0,1\]
-   易于用向量（矢量）和矩阵运算，简化计算

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%8F%82%E6%95%B0%E6%9B%B2%E7%BA%BF%E7%9A%84%E7%9B%B8%E5%85%B3%E6%A6%82%E5%BF%B5 "参数曲线的相关概念")参数曲线的相关概念

内容来自微分几何（用微分的方法来研究曲线的局部性质，比如弯曲程度）

[![1559561811659](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559561811659.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559561811659.png)

-   {x\=x(t) y\=y(t) z\=z(t)，p‘(t)\=dPdt，p‘‘(t)\=d2Pdt2
    
-   位置矢量
    
    -   曲线上任一点的位置矢量可表示为：p(t)\=\[x(t),y(t),z(t)\]
-   切矢量
    
    -   选择弧长s作为参数，当 △t→0时，弦长△s→0，但方向不能趋向于0。
    -   单位失切量：T\=dPds\=limΔx→0ΔPΔs\=dPdt·dtds\=P‘(t)|P‘(t)|
-   曲率
    
    -   切向量再求导
    -   几何意义：曲线的单位切向量对弧长的转动率，刻画某一点曲线的弯曲程度
    
    [![1559562497335](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559562497335.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559562497335.png)
    
    -   曲率 K\=|T‘|\=limΔx→0|ΔTΔs|\=limΔx→0|T(s+Δs)−T(s)Δs|\=limΔx→0|ΔθΔs|，越大曲线越弯
    -   曲率半径 ρ\=1K ，越小圆弧越陡越大圆弧越平缓
-   法矢量
    
    -   法矢量是与切矢量垂直的向量
    
    [![1559563874431](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559563874431.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559563874431.png)
    
-   挠率
    
    -   空间曲线不但要弯曲，而且还要扭曲，即要离开它的密切平面。为了能刻画这一扭曲程度，等价于去研究密切平面的法矢量（即曲线的副法矢量）关于弧长的变化率。
    -   挠率 τ 的绝对值等于副法线方向(或密切平面)对于弧长的转动率：|τ|\=limΔx|ΔθΔs|

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%8F%92%E5%80%BC "插值")插值

自由曲线、自由曲面一般通过少数分散的点生成，这些点即“型值点”、“样本点”或“控制点”。

插值曲线：插值(interpolation)构造出来的曲线

[![1559564532129](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559564532129.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559564532129.png)

-   线性插值
    
    -   f(x)在两个不同点x1和x2间值，用线形函数y=ax+b近似代替
    
    [![1559564624619](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559564624619.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559564624619.png)
    
-   抛物线插值
    
    -   f(x)在三个不同点x1、x2、x3间值，用抛物线 φ(x)\=ax2+bx+c 近似代替
    
    [![1559564729325](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559564729325.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559564729325.png)
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%8B%9F%E5%90%88 "拟合")拟合

拟合曲线：构造一条曲线使之在某种意义下最接近给定的数据点(但未必通过这些点)

逼近：通常指用一些性质较好的函数近似表示一些性质不好的函数。插值和拟合都可以视为逼近

对于逼近样条，连接控制点序列的折线（控制多边形/特征多边形）通常被显示出来，以提醒设计者控制点的次序

[![1559565055807](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559565055807.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559565055807.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%85%89%E9%A1%BA "光顺")光顺

指曲线的拐点不能太多（有一、二阶导数等）

[![1559565125603](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559565125603.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559565125603.png)

相对光顺：

-   具有二阶几何连续性(G2)
-   不存在多余拐点和奇异点
-   曲率变化较小

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%BF%9E%E7%BB%AD%E6%80%A7 "连续性")连续性

曲线段首尾相接，在连接处如何有合乎要求的连续性

曲线段 pi\=pi(t)，t∈\[ti0,ti1\]

-   参数连续性
    
    -   0阶参数连续性，又称C0连续性，指曲线的几何位置连接，即前后两曲线相接处的x,y,z值相等
    -   1阶参数连续性，又称C1连续性，即前后两曲线相接处的一阶导数(切线)相等
    -   2阶参数连续性，又称C2连续性，即前后两曲线相接处的一阶导数和二阶导数都相等。C2连续性交点处的切向量变化率相等，即切线从一个曲线段平滑地变化到另一个曲线段
    
    [![1559565518737](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559565518737.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559565518737.png)
    
-   几何连续性
    
    -   经典的参数连续性在图形学不适合，太苛刻。几何连续性只要求曲线段在相交处的参数导数成比例即可
    -   0阶几何连续性，又称G0连续性。与0阶参数连续性的定义相同，满足：pi(ti1)\=p(i+1)(t(i+1)0)
    -   1阶几何连续性，又称G1连续性。满足G0连续的前提下，有公共的切矢：Q‘(0)\=αP‘(1)，(α\>0)
        -   导数相等指大小方向都相等，公共切矢指方向相等大小不一定等
    -   2阶几何连续性，又称G2连续性。满足G1连续的前提下，有公共的曲率

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%8F%82%E6%95%B0%E5%8C%96 "参数化")参数化

过三点构造参数表示的插值多项式有无数。

常用方法

-   均匀参数化
    -   节点在参数轴等距分布
-   累加弦长参数化
    -   根据长度的比例关系来确定 t
    -   {t0\=0 ti\=ti−1+|ΔPi−1|,i\=1,⋯,n,ΔPi\=Pi+1−Pi
-   向心参数化法
    -   向心参数化法假设在一段曲线弧上的向心力与曲线切矢从该弧段始端至末端的转角成正比，加上一些简化假设，得到向心参数化法。此法尤其适用于非均匀型值点分布。
    -   {t0\=0 ti\=ti−1+|ΔPi−1|12,i\=1,⋯,n

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%8F%82%E6%95%B0%E6%9B%B2%E7%BA%BF%E7%9A%84%E4%BB%A3%E6%95%B0%E5%BD%A2%E5%BC%8F%E5%92%8C%E5%87%A0%E4%BD%95%E5%BD%A2%E5%BC%8F "参数曲线的代数形式和几何形式")参数曲线的代数形式和几何形式

-   代数形式
    
    -   {x(t)\=a3xt3+a2xt2+a1xt+a0x y(t)\=a3yt3+a2yt2+a1yt+a0y z(t)\=a3zt3+a2zt2+a1zt+a0z,t∈\[0,1\]
    -   上式的矢量式为 P(t)\=a3t3+a2t2+a1t+a0，ai是参数曲线的系数，且不是常数是向量，比如 a3 对应 a3x,a3y,a3z，但改变系数曲线如何变化不清楚，这是代数形式的缺点
-   几何形式
    
    -   利用一条曲线端点的几何性质来刻画一条曲线，比如利用曲线的端点位置、切向量、各阶导数等端点的信息。
    -   对三次参数曲线，若用其端点位矢P(0)、P(1)和切矢P’(0)、P’(1)描述。需要这四个量来刻画三次参数曲线

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Hermit%E6%9B%B2%E7%BA%BF%E7%9A%84%E6%8E%A8%E5%AF%BC "Hermit曲线的推导")Hermit曲线的推导

参数曲线的几何形式，对三次参数曲线，若用其端点位矢P(0)、P(1)和切矢P’(0)、P’(1)描述。需要这四个量来刻画三次参数曲线：

1.  将位矢P(0)、P(1)和切矢P’(0)、P’(1) 简记为 P0、P1、P0‘、P1‘，代入三次参数曲线 P(t)\=a3t3+a2t2+a1t+a0，t∈\[0,1\]
    
2.  得 {P0\=a0 P1\=a3+a2+a1+a0 P0‘\=a1 P1‘\=3a3+2a2+a1⇒{a0\=P0 a1\=P0‘ a2\=−3P0+3P1−2P0‘−P1‘ a3\=2P0−2P1+P0‘+P1‘
    
3.  回代入 P(t) 得 P(t)\=(2t3−3t2+1)P0+(−2t3+3t2)P1+(t3−2t2+t)P0‘+(t3−t2)P1‘，t∈\[0,1\]
    
4.  令 {F0(t)\=2t3−3t2+1 F1(t)\=−2t3+3t2 G0(t)\=t3−2t2+t G1(t)\=t3−t2⇒P(t)\=F0P0+F1P1+G0P0‘+G1P1‘，t∈\[0,1\]
    

上式即是三次 Hermit 曲线的几何形式，几何系数是 P0、P1、P0‘、P1‘ ，调和函数是 F0、F1、G0、G1。

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bezier%E6%9B%B2%E7%BA%BF%E4%B8%8E%E6%9B%B2%E9%9D%A2 "Bezier曲线与曲面")Bezier曲线与曲面

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bezier%E6%9B%B2%E7%BA%BF%E7%9A%84%E8%83%8C%E6%99%AF "Bezier曲线的背景")Bezier曲线的背景

插值：曲线通过所有的数据点

逼近：曲线逼近这些数据点

当用曲线段拟合曲线f(x)时，可以把曲线表示为许多小线段 φi(x) 之和，其中 φi(x) 称为基（混合）函数：f(x)\=∑i\=0naiϕi(x)。经常会选择多项式作基函数。

Bezier博士的想法是：先勾画折线多边形，再用光滑的参数曲线（Bezier曲线）逼近折线多边形（特征多边形）

[![1559614251748](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559614251748.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559614251748.png)

他的方程是： {p(t)\=∑i\=0nPi·fi,n(t)，t∈\[0,1\] fi,n(t)\={1,i\=0 (−t)i(i−1)!di−1dti−1(1−t)n−1−1t称为Bezier基函数

后来，剑桥大学博士生Forrest证明了Bezier曲线的基函数可以简化成伯恩斯坦基函数 Bi,n(t)\=Cniti(1−t)n−i\=n!i!(n−i)!ti(1−t)n−i，i\=0,1,⋯,n

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bezier%E6%9B%B2%E7%BA%BF%E7%9A%84%E5%AE%9A%E4%B9%89 "Bezier曲线的定义")Bezier曲线的定义

设空间 n+1 个点的位置矢量 Pi，i\=0,1,⋯,n

则Bezier曲线段的参数方程 p(t)\=∑i\=0nPi·Bi,n(t)，t∈\[0,1\]

由二项式定理，∑i\=0nBi,n(t) 恰好是二项式 \[t+(1−t)\]n的展开式（00\=0!\=1）

-   一次Bezier曲线
    
    -   对 p(t)，当n=1，有两个控制点 p0、p1，Bezier多项式为一次多项式
    -   {p(t)\=P0B0,1(t)+P1B1,1(t) B0,1(t)\=1−t B1,1\=t⇒p(t)\=(1−t)P0+tP1
    -   是连接 p0、p1 的直线段
-   二次Bezier曲线
    
    -   对 p(t)，当n=2，有两个控制点 p0、p1、p2，Bezier多项式为二次多项式
    -   {p(t)\=P0B0,2(t)+P1B1,2(t)+P2B2,2(t) B0,2(t)\=(1−t)2 B1,2\=2t(1−t) B2,2\=t2⇒p(t)\=(1−t)2P0+2t(1−t)P1+t2P2
    -   是一条抛物线，其矩阵形式为 p(t)\=\[t2t1\]·\[1−21 −220 100\]·\[P0 P1 P2\]
-   三次Bezier曲线
    
    -   对 p(t)，当n=3，有两个控制点 p0、p1、p2、p3，Bezier多项式为三次多项式
    -   {p(t)\=P0B0,3(t)+P1B1,3(t)+P2B2,2(t)+P3B3,3(t) B0,3(t)\=(1−t)3 B1,3(t)\=3t(1−t)2 B2,3(t)\=3t2(1−t) B3,3(t)\=t3⇒ p(t)\=(1−t)3P0+3t(1−t)2P1+3t2(1−t)P2+t3P3
    -   [![1559616363334](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559616363334.png)
        
        1559616363334
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559616363334.png)
    -   矩阵形式：p(t)\=\[t3t2t1\]·\[−13−31 3−630 −3300 1000\]·\[P0 P1 P2 P3\]\=T·Mbe·Gbe，其中 Mbe 是三次Bezier曲线系数矩阵，Gbe 是4个控制点位置矢量。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bernstein%E5%9F%BA%E5%87%BD%E6%95%B0%E7%9A%84%E6%80%A7%E8%B4%A8 "Bernstein基函数的性质")Bernstein基函数的性质

Bi,n(t)\=Cniti(1−t)n−i\=n!i!(n−i)!ti(1−t)n−i，i\=0,1,⋯,n

-   非负性
    
    -   Bi,n(t)\={\=0t\=0,1 \>0t∈(0,1),i\=1,⋯,n−1
-   权性
    
    -   ∑i\=0nBi,n(t)\=1，t∈(0,1)
-   端点性质
    
    -   Bi,n(0)\={i(i\=0) 0otherwise Bi,n(1)\={i(i\=n) 0otherwise
-   对称性
    
    -   保持n次Bezier曲线控制多边形的顶点位置不变，而把次序颠倒过来，则此时曲线仍不变，只不过曲线的走向相反而已
    
    [![1559616846775](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559616846775.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559616846775.png)
    
-   递推性
    
    -   Bi,n(t)\=(1−t)Bi,n−1(t)+tBi−1,n−1(t)，i\=0,⋯,n
-   导函数
    
    -   B‘i,n(t)\=n\[Bi−1,n−1(t)−Bi,n−1(t)\]，i\=0,⋯,n
-   最大值
    
    -   Bi,n(t) 在 t\=in 处取最大值
-   积分
    
    -   ∫01Bi,n(t)dt\=1n+1
-   降阶公式
    
    -   一个n次Bernstein基函数能表示成两个n-1次基函数的线性和，Bi,n(u)\=(1−u)Bi,n−1(u)+uBi−1,n−1(u)
-   升阶公式
    
    -   Bi,n(u)\=(1−in+1)Bi,n+1(t)+i+1n+1Bi+1,n+1(t)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bezier%E6%9B%B2%E7%BA%BF%E7%9A%84%E6%80%A7%E8%B4%A8 "Bezier曲线的性质")Bezier曲线的性质

-   端点性质
    
    -   顶点 p0 和 pn 分别位于实际曲线段的起点和终点上
    
    [![1559617244477](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559617244477.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559617244477.png)
    
    -   p(0)\=∑i\=0nPi·Bi,n(0)\=P0 p(1)\=∑i\=1nPi·Bi,n(1)\=P1
-   一阶导数
    
    -   Bernstein基函数的一阶导数 $ B’ _{i,n}(t) = n\[B_{i-1,n-1}(t) - B\_{i,n-1}(t)\]，i=0, \\cdots , n \\ p ‘ (t) = n \\sum\\limits\_{i=1}^n (p\_i-p\_{i-1}) B\_{i-1,n-1}(t) $
    -   p‘(0)\=n(p1−p0) p‘(1)\=n(pn−pn−1)，这说明Bezier曲线的起点和终点处的切线方向和特征多边形的第一条边及最后一条边的走向一致。
-   几何不变形
    
    -   指某些几何特性不随坐标变换而变化的特性。Bezier曲线的形状仅与控制多边形各顶点的相对位置有关，而与坐标系的的选择无关
-   变差缩减性
    
    -   若Bezier曲线的特征多边形是一个平面图形，则平面内任意直线与p(t)的交点个数不多于该直线与其特征多边形的交点个数
    -   此性质反映了Bezier曲线比其特征多边形的波动还小，也就是说Bezier曲线比特征多边形的折线更光顺
    
    [![1559617541070](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559617541070.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559617541070.png)
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bezier%E6%9B%B2%E7%BA%BF%E7%9A%84%E7%94%9F%E6%88%90 "Bezier曲线的生成")Bezier曲线的生成

根据定义直接生成：

-   给出 Cni 的递归计算式：Cni\=n!i!(n−i)!\=n−i+1iCni−1，n≥i
-   将 p(t)\=∑i\=0nPi·Bi,n(t)，t∈\[0,1\] 表示成分量坐标形式： {x(t)\=∑i\=0nxi·Bi,n(t) y(t)\=∑i\=0nyi·Bi,n(t) z(t)\=∑i\=0nzi·Bi,n(t)，t∈\[0,1\]

de Casteljau算法（Bezier曲线的递推算法）：

-   每次取每条线段上等比例t的点P连线，n次后得到的单一连线的比例t处是Bezier曲线上一点，不断的变化 t ( 0->1 )，即可得到Bezier曲线
-   二次Bezier曲线举例：

[![1559650056409](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559650056409.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559650056409.png)

-   三次Bezier曲线举例：

[![1559650216713](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559650216713.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559650216713.png)

-   公式：Pik\={Pik\=0 (1−t)Pik−1+tPi+1k−1k\=1,⋯,n，i\=0,⋯,n−k，Pi为控制点，k 为第k级递推时

[![1559651613564](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559651613564.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559651613564.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bezier%E6%9B%B2%E7%BA%BF%E7%9A%84%E6%8B%BC%E6%8E%A5 "Bezier曲线的拼接")Bezier曲线的拼接

几何设计中，一条Bezier曲线往往难以描述复杂的曲线形状。这是由于增加特征多边形的顶点数，会引起Bezier曲线次数的提高，而高次多项式又会带来计算上的困难。所以采用分段设计，然后将各段曲线相互连接起来，并在接合处保持一定的连续条件

拼接：

-   给两条Bezier曲线P(t)和Q(t)，相应控制点为Pi(i =0,1,…,n)和Qi(i=0,1,…,m)
-   要使它们达到 G0 连续，保证：Pn\=Q0
-   要使它们达到 G1 连续，保证Pn−1，Pn\=Q0，Q1三点共线

[![1559652788052](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559652788052.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559652788052.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bezier%E6%9B%B2%E7%BA%BF%E7%9A%84%E5%8D%87%E9%98%B6%E5%92%8C%E9%99%8D%E9%98%B6 "Bezier曲线的升阶和降阶")Bezier曲线的升阶和降阶

升阶：保证曲线的形状和定向保持不变，增加顶点个数。比如将找一个三次多项式逼近一个二次多项式，但伯恩斯坦基函数不是简单的多项式函数。

降阶，则是反之。

Bezier升阶：

[![1559652992898](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559652992898.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559652992898.png)

-   定义原控制顶点为 P0,P1,⋯,Pn，升阶增加一个顶点后仍定义为 $ P\_0^_,P\_1^_,\\cdots ,P\_{n+1}^\* $
    
-   要求曲线形状和定向不变，则 ∑i\=0nCniPiti(1−t)n−i\=∑i\=0n+1Cn+1iPi∗ti(1−t)n+1−i
    
-   对上式左乘 (t+(1−t)) 得： ∑i\=0nCniPi(ti(1−t)n+1−i+ti+1(1−t)n−i)\=∑i\=0n+1Cn+1iPi∗ti(1−t)n+1−i
    
-   比较等式两边 ti(1−t)n+1−t 项的系数，得到： Pi∗Cn+1i\=PiCni+Pi−1Cni−1
    
-   化简得：Pi∗\=in+1Pi−1+(1−in+1)Pi，(i\=0,⋯,n+1) 其中 P−1\=Pn+1\=(0,0)
    
    -   此式说明  
        新的控制顶点 Pi∗ 是以参数值 in+1按分段线性插值从原始特征多边形得到的  
        升阶后的新特征多边形在原始特征多边形的凸包内  
        特征多边形更靠近曲线

Bezier降阶：

-   $\\begin{cases} P\_i^_\\frac{nP\_i-iP\_{i-1}^_}{n-i} & i=0,1,\\cdots, n-1 \\ P\_{i-1}^\* = \\frac{nP\_i-(n-i)P\_i^\*}{i} & i=n,n-1,\\cdots ,1 \\end{cases} $

Bezier升降阶的重要性：

-   它是CAD系统之间数据传递与交换的需要
-   它是系统中分段(片)线性逼近的需要，通过逐次降阶，把曲面化为直线平面，便于求交和曲面绘制
-   它是外形信息压缩的需要。降阶处理以后可以减少存储的信息量

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Bezier%E6%9B%B2%E9%9D%A2 "Bezier曲面")Bezier曲面

基于Bezier曲线拓展给出基于Bezier曲面的定义

定义：

-   设 Pi,j（i\=0,1,⋯,m，j\=0,1,⋯,n） 为 (n+1)×(m+1) 个空间点，则 m×n Bezier曲面为：P(u,v)\=∑i\=0m∑j\=0nPij·Bi,m(u)·Bj,n(v)，u,v∈\[0,1\]
-   Bi,m(u)\=Cmiui(1−u)m−i Bj,n(v)\=Cnjvj(1−v)n−j
-   矩阵表示式：P(u,v)\=\[B0,m(u)B1,m(u)⋯Bm,m(u)\]·\[P00P01⋯P0n P10P11⋯P1n ⋯⋯⋯⋯ Pm0Pm1⋯Pmn\]·\[B0,n(v) B1,n(v) ⋯ Bn,n(v) \] 
-   特征网格：依次用线段连接点列中相邻两点所形成的空间网格

[![1559653679192](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559653679192.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559653679192.png)

-   角点位置：控制网络的四个点
-   边界线：Bezier曲面的四条边界线是Bezier曲线

[![1559654173150](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559654173150.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559654173150.png)

性质：

-   Bezier曲面特征网格的四个角点正好是Bezier曲面的四个角点，即 P(0,0)\=P00，⋯
    
-   Bezier曲面特征网格最外一圈顶点定义Bezier曲面的四条边界
    
-   几何不变性
    
-   对称性
    
-   凸包性
    

Bezier曲面片的拼接：

-   设两张 m×n 次Bezier曲面片：P(u,v)\=∑i\=0m∑j\=0nPij·Bi,m(u)·Bj,n(v)，u,v∈\[0,1\] Q(u,v)\=∑i\=0m∑j\=0nQij·Bi,m(u)·Bj,n(v)，u,v∈\[0,1\]
-   要求两曲面片达到 G0 连续，则它们有公共的边界，则 P(1,v)\=Q(0,v)⇒Pni\=Q0i，i\=0,⋯,m
-   要求沿该公共边界达到 G1 连续，则两曲面片在该边界上有公共的切平面，因此曲面的法向应跨界连续，Qu(0,v)×Qv(0,v)\=α(v)Pu(1,v)×Pv(1,v)

递推(de Casteljau)算法（曲面的求值）：

-   一条曲线可表示成两条低一次曲线的组合，则将一张曲面表示成低一次的四张曲面的线性组合
-   Pi,jk,l\={Pijk\=l\=0 (1−u)Pijk−1,0+uPi+1,jk−1,0k\=1,⋯,m，l\=0 (1−v)P0,jm,l−1+vP0,j+1m,l−1k\=m，l\=1,⋯,n
-   按上式，以 u 为参数值对控制网格 u 方向的 n+1 个多边形执行递推算法，m级递推后，得到 n+1 个顶点 P0jm0 构成的多边形，再以 v 参数值拿这 n+1 个顶点当作新控制顶点来算，得到 P00mn 为曲面上一点

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#B%E6%A0%B7%E6%9D%A1%E6%9B%B2%E7%BA%BF%E4%B8%8E%E6%9B%B2%E9%9D%A2 "B样条曲线与曲面")B样条曲线与曲面

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#B%E6%A0%B7%E6%9D%A1%E4%BA%A7%E7%94%9F%E7%9A%84%E8%83%8C%E6%99%AF "B样条产生的背景")B样条产生的背景

Bezier曲线的不足：

-   一旦确定了特征多边形的顶点数，即确定了曲线的阶次
    
-   Bezier曲线/面的拼接比较复杂
    
-   Bezier曲线/面不能作局部修改
    
    -   Bernstein多项式在\[0, 1\] 上都有支撑，故每个控制项都对 t∈\[0,1\]有影响。
    
    [![1559741749636](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559741749636.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559741749636.png)
    

样条(Spline)：

-   分段连续多项式
    
-   整条曲线用一个完整的表达形式，但内在的量是一段一段的
    
    -   比如5个点，用Bezier曲线构造的多项式应是四次多项式，用样条构造四段曲线，每一段都是三次，且段间 C2 连续。
-   既克服了波动现象，曲线又是低次的。既有统一的表达时，又有统一的算法
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#B%E6%A0%B7%E6%9D%A1%E7%9A%84%E9%80%92%E6%8E%A8%E5%AE%9A%E4%B9%89%E5%92%8C%E6%80%A7%E8%B4%A8 "B样条的递推定义和性质")B样条的递推定义和性质

Ｂ样条曲线的数学表达式为：P(u)\=∑i\=0nPiBi,k(u)，u∈\[uk−1,un+1\]，Pi 是控制多边形的顶点。对比Bezier曲线：P(u)\=∑i\=0nPiBi,n(u)，u∈\[0,1\] ，有两点不一样：

-   一是伯因斯坦基函数的下标参数
    
    -   Bi,k(u) 称为 k 阶(k-1次)的B样条基函数，k 是刻画次数的。
    -   对于Bezier曲线，阶数等于次数，B样条而言，阶数等于次数加一
-   二是 u 的取值范围
    
    -   B样条基函数是一个非递减的参数u的序列（称为节点向量）所决定的k阶分段多项式
    
    [![1559742527922](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559742527922.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559742527922.png)
    

de Boor-Cos递推定义：

-   公认的最容易理解
    
-   原理：由0次构造1次，1次构造2次，依次类推。
    
-   {Bi,1(u)\={1ui<u<ui+1 0otherwise Bi,k(u)\=u−uiui+k−1−uiBi,k−1(u)+ui+k−uui+k−ui+1Bi+1,k−1(u)，约定00\=0
    
-   若确定第i个k阶B样条 Bi,k(u)，需要用到 ui,ui+1,…,ui+k 共k+1个节点，称区间 \[ui,ui+k\] 为Bi,k(u)的支撑区间
    
-   Bi,1(u) 是0次多项式，推出1次的 Bi,2(u) 是一个分段函数
    
    [![1559743057710](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559743057710.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559743057710.png)
    

de Boor-Cos递推公式：$d\_j^i = {dj,l\=0 (1−αjl)dj−1l−1+αjldjl−1,l\=1,⋯,阶数−1， \\alpha _j^l = \\frac{u-u\_j}{u_{j+阶数-l}-t\_j } $

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#B%E6%A0%B7%E6%9D%A1%E5%9F%BA%E5%87%BD%E6%95%B0%E5%AE%9A%E4%B9%89%E5%8C%BA%E9%97%B4%E5%8F%8A%E8%8A%82%E7%82%B9%E5%90%91%E9%87%8F "B样条基函数定义区间及节点向量")B样条基函数定义区间及节点向量

ezie & cr曲线的定义区间 \[0, 1\]

K阶B样条对应节点向量数：

-   Bi,1涉及 \[ui,ui+1\] 一个区间，即涉及 1 个区间 2 个节点；  
    Bi,2 由 Bi,1 和 Bi+1,1 组成，即涉及 2 个区间 3 个节点；  
    …  
    Bi,k 涉及 k 个区间 k+1 个节点。

B样条函数定义区间——u∈\[uk−1,un+1\]：

-   即在 \[uk−1,un+1\] 产生拼接。
    
-   首先，区间要合法，区间里必要有足够的基函数与定点配对。B样条基函数严重依赖于节点向量的分布。
    

[![1559743920990](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559743920990.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1559743920990.png)

-   上图中区间 \[u3,u5\]（从uk−1到un+1）是第一个开始有意义的区间，故此上面的曲线被分成两段 u3u4，u4u5，即考虑拼接 P0P1P2P3 （刚好在u3u4区间有定义）和 P1P2P3P4（刚好在u4u5区间有定义），两端有三个定点相同，拼接效果良好

节点向量：

-   ui 是节点值， U\=(u0,u1,⋯,un+k) 构成了k阶(k-1次)的B样条函数的节点向量

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#B%E6%A0%B7%E6%9D%A1%E5%9F%BA%E5%87%BD%E6%95%B0%E7%9A%84%E4%B8%BB%E8%A6%81%E6%80%A7%E8%B4%A8 "B样条基函数的主要性质")B样条基函数的主要性质

-   局部支承性
    
    -   Bi,k(u){≥0u∈\[ui,ui+k\] \=0otherwise 而Bezier在整个区间非0
    -   反过来，对每一个区间 (ui,ui+k) ，至多只有 k 个基函数在其上非零
-   权性
    
    -   ∑i\=0nBi,k(u)\=1，u∈\[uk−1,un+1\]
-   连续性
    
    -   Bi,k(u) 在 r 重节点处的连续阶不低于 k-1-r
-   分段参数多项式
    
    -   Bi,k(u) 在每个长度非零的区间 \[ui,ui+1) 上都是次数不高于 k-1 的多项式，它在整个参数轴上是分段多项式

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#B%E6%A0%B7%E6%9D%A1%E5%87%BD%E6%95%B0%E7%9A%84%E4%B8%BB%E8%A6%81%E6%80%A7%E8%B4%A8 "B样条函数的主要性质")B样条函数的主要性质

-   局部性
    -   k阶B样条曲线上的一点至多与k个控制顶点有关，与其它控制顶点无关
    -   移动曲线的第i个控制顶点Pi ，至多影响到定义在区间上那部分曲线的形状，对曲线其余部分不发生影响
-   变差缩减性
    -   设平面内 n+1 个控制顶点构成B样条曲线 P(t) 的特征多边形。在该平面内的任意一条直线与 P(t) 的交点个数不多于该直线和特征多边形的交点个数
-   几何不变性
    -   B样条曲线的形状和位置与坐标系的选择无关
-   凸包性
    -   B样条曲线落在Pi构成的凸包之中。其凸包区域小于或等于同一组控制顶点定义的Bezier曲线凸包区域
    -   凸包就是包含右边这6个顶点的最小凸多边形。凸多边形是把多边形的每条边延长，其它边都在它的同一侧  
        [![1560587703864](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560587703864.png)
        
        1560587703864
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560587703864.png)
    -   该性质导致顺序k+1个顶点重合时，由这些顶点定义的k次B样条曲线段退化到这一个重合点；  
        顺序k+1个顶点共线时，由这些顶点定义的k次B样条曲线形状是？

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#B%E6%A0%B7%E6%9D%A1%E6%9B%B2%E7%BA%BF%E7%B1%BB%E5%9E%8B%E7%9A%84%E5%88%92%E5%88%86 "B样条曲线类型的划分")B样条曲线类型的划分

均匀B样条曲线（uniform B-splinecurve）

-   当节点沿参数轴均匀等距分布，即 ui+1−ui\=常数\>0 时，表示均匀B样条函数  
    {0, 1, 2, 3, 4, 5, 6}  
    {0, 0.2, 0.4, 0.6, 0.6, 0.8, 1}
    
-   均匀B样条的基函数呈周期性。即给定n和k，所有的基函数有相同形状。每个后续基函数仅仅是前面基函数在新位置上的重复：Bi,k(u)\=Bi+1,k(u+Δu)\=Bi+2,u(u+2Δu)
    
-   其中 Δu 是相邻节点值的间距，等价地，可以写为： Bi,k(u)\=B0,k(u−kΔu)
    

均匀周期性B样条基函数的计算举例：

-   以均匀二次（三阶）B样条曲线为例
-   假定有四个控制点，取参数值 n=3，k=3，则 n+m=6，u\=(0,1,2,3,4,5,6)
-   根据de Boor-Cox递推公式  
    P(u)\=∑i\=0nPiBi,k(u)，{Bi,1(u)\={1ui<u<ui+1 0otherwise Bi,k(u)\=u−uiui+k−1−uiBi,k−1(u)+ui+k−uui+k−ui+1Bi+1,k−1(u)，约定00\=0
-   算得：B0,1(u)\={10≤u<1 0otherwise，u\=(0,1,2,3,4,5,6) B0,2(u)\=uB0,1(u)+(2−u)B1,1(u)\={u0≤u<1 2−u1≤u<2 B0,3(u)\=u2B0,2(u)+3−u2B1,2(u−1)\={12u20≤u<1 12u(2−u)+12(u−1)(3−u)1≤u<2 12(3−u)22≤u<3 B1,3(u)\={12(u−1)21≤u<2 12(u−1)(3−u)+12(u−2)(4−u)2≤u<3 12(4−u)23≤u<4 B3,3(u)\={12(u−3)23≤u<4 12(u−3)(5−u)+12(u−4)(6−u)4≤u<5 12(6−u)25≤u<6

准均匀 B 样条曲线（Quasi-uniform B-splinecurve）：

[![1560588911955](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560588911955.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560588911955.png)

-   与均匀B样条曲线的差别在于两端节点具有重复度k，这样的节点矢量定义了准均匀的B样条基
-   均匀：u = (0,1,2,3,4,5,6)
-   准均匀：u = (0,0,0,1,2,3,4,5,5,5)
-   均匀B样条曲线没有保留Bezier曲线端点的几何性质，采用准均匀的B样条曲线解决了这个问题

分段Bezier曲线（Piecewise Bezier Curve）：

[![1560588946151](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560588946151.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560588946151.png)

-   节点矢量中两端节点具有重复度k，所有内节点重复度为k-1，这样的节点矢量定义了分段的Bernstein基
-   B样条曲线用分段Bezier曲线表示后，各曲线段就具有了相对的独立性
-   另外，Bezier曲线一整套简单有效的算法都可以原封不动地采用
-   缺点是增加了定义曲线的数据，控制顶点数及节点数

非均匀B样条曲线（non-uniform B-splinecurve）：

-   当节点沿参数轴的分布不等距，即 ui+1−ui≠常数 时，表示非均匀B样条函数

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#B%E6%A0%B7%E6%9D%A1%E6%9B%B2%E9%9D%A2 "B样条曲面")B样条曲面

给定参数轴 u 和 v 的节点矢量：{U\=\[u0,u1,⋯,um+p\] V\=\[v0,v1,⋯,vn+q\]

则 p×q 阶B样条曲面定义为： P(u,v)\=∑i\=0m∑j\=0nPi,jNi,p(u)Nj,q(v)

B样条曲面的特征网络： Pi,j 构成的一张控制网格

$N\_{i,p}(u)，N\_{j,v) - C$ 是B样条基，分别由节点矢量U和V按deBoor-Cox递推公式决定

## [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AC%AC6%E7%AB%A0-%E7%9C%9F%E5%AE%9E%E6%84%9F%E5%9B%BE%E5%BD%A2%E5%AD%A6 "第6章 真实感图形学")第6章 真实感图形学

真实感图形学的三部曲：

-   建模：建立三维场景
-   消隐：消隐解决物体深度的显示及确认物体内的相互关系
-   渲染：消隐后，在可见面上进行敏感光泽的处理，然后绘制

学习本章之前，先完全记住以下单词：

-   incident light，入射光
-   diffuse，扩散，漫反射
-   specular，缩写spec，镜面的
-   refracted，折射的
-   transparent，透明的
-   Distribution，分布
-   Intensity，光强

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E9%A2%9C%E8%89%B2%E6%A8%A1%E5%9E%8B "颜色模型")颜色模型

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E9%A2%9C%E8%89%B2 "颜色")颜色

-   颜色是人的视觉系统对可见光的感知结果，感知到的颜色由光波的波长决定。
-   人眼对于颜色的观察和处理是一种生理和心理现象，其机理还没有完全搞清楚。
-   视觉系统能感觉的波长范围为380～780nm。  
    [![1560479200313](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479200313.png)
    
    1560479200313
    
    ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479200313.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E9%A2%9C%E8%89%B2%E6%A8%A1%E5%9E%8B-1 "颜色模型")颜色模型

-   颜色模型（颜色空间），是表示颜色的一种数学方法，人们用它来标定颜色。通常用三个参数表示。
-   几乎所有的颜色模型都从RGB颜色模型导出。
-   目前现有颜色模型还没有一个完全符合人的视觉感知特性、颜色本身的物理特性或发光物体和光反射物体的特性。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#RGB%E9%A2%9C%E8%89%B2%E5%B7%A5%E4%B8%9A%E6%A8%A1%E5%9E%8B "RGB颜色工业模型")RGB颜色工业模型

-   如图所示，单位立方体中的三个角对应红色(R)、绿色(G)、蓝色(B)三基色，而其余三个角分别对应于三基色的补色——青色(C)、黄色(Y)、品红色(M)
-   从RGB单位立方体的原点即黑色(0,0,0)到白色顶点(1,1,1)的主对角线被称为灰度线，线上所有的点具有相等的分量，产生灰度色调。  
    [![1560479318134](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479318134.png)
    
    1560479318134
    
    ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479318134.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%85%B6%E4%BB%96%E9%A2%9C%E8%89%B2%E5%B7%A5%E4%B8%9A%E6%A8%A1%E5%9E%8B "其他颜色工业模型")其他颜色工业模型

-   主要用于彩色电视信号传输标准，主要有YIQ、 YUV、 YCbCr彩色模型。
-   三种彩色模型中，Y分量均代表黑白亮度分量，其余分量用于显示彩色信息。只需利用Y分量进行图像显示，彩色图像就转为灰度图像。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E9%A2%9C%E8%89%B2%E8%A7%86%E8%A7%89%E6%A8%A1%E5%9E%8B "颜色视觉模型")颜色视觉模型

-   以上彩色模型是从色度学或硬件实现的角度提出的
    
-   但用色调(Hue)、饱和度(Saturation，也称彩度)、亮度(Illumination)三要素来描述彩色空间能更好地与人的视觉特性相匹配。
    
-   颜色的三个基本属性（也称人眼视觉三要素）
    
    -   色调(Hue)：由物体反射光线中占优势的波长决定的，是彩色互相区分的基本特性。
    -   饱和度(Saturation)或彩度：彩色的深浅程度，它取决于彩色中白色的含量。饱和度越高，彩色越深，白色光越少。
    -   亮度(Illumination)：光波作用于感受器所发生的效应，它取决于物体的反射系数。反射系数越大，物体亮度越大。
    
    [![1560479466939](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479466939.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479466939.png)
    
-   HSI彩色模型是截面为三角形或圆形的锥体模型。
    
    -   H，色调，颜色的外观，用角度表示：如赤橙黄绿青蓝紫  
        [![1560479643866](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479643866.png)
        
        1560479643866
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479643866.png)
    -   S，饱和度，分为  
        低(0%～20%)，不管色调如何而产生灰色  
        中(40%～60%)，产生柔和的色泽(pastel)  
        高(80%～100%)，产生鲜艳的颜色(vivid color)  
        [![1560479708264](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479708264.png)
        
        1560479708264
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479708264.png)
    -   I，光照，颜色的量度，取值范围从0%(黑)～100%(最亮)  
        [![1560479742546](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479742546.png)
        
        1560479742546
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479742546.png)

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%85%B6%E4%BB%96%E9%A2%9C%E8%89%B2%E8%A7%86%E8%A7%89%E6%A8%A1%E5%9E%8B "其他颜色视觉模型")其他颜色视觉模型

-   HSV彩色模型（Hue，Saturation，Value）  
    [![1560479832611](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479832611.png)
    
    1560479832611
    
    ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560479832611.png)
-   HSL采用亮度L(lightness)、HSV采用明度V(value)作为坐标。

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%AE%80%E5%8D%95%E5%85%89%E7%85%A7%E6%A8%A1%E5%9E%8B "简单光照模型")简单光照模型

光照明模型：illumination model，模拟物体表面的光照明物理现象的数学模型。简单光照明模型只考虑光源对物体的直接光照

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%85%89%E7%85%A7%E6%A8%A1%E5%9E%8B%E7%9A%84%E5%8F%91%E5%B1%95 "光照模型的发展")光照模型的发展

-   1967年，Wylie等人第一次在显示物体时加进光照效果，认为光强与距离成反比。
-   1970年，Bouknight提出第一个光反射模型：Lambert漫反射＋环境光（第一个可用的光照模型）。
-   1971年，Gouraud提出漫反射模型加插值的思想（漫反射的意思是光强主要取决于入射光的强度和入射光与法线的夹角）。
-   1975年，Phong提出图形学中第一个最有影响的光照明模型 。在漫反射模型的基础上加进了高光项。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E8%83%8C%E6%99%AF%E7%89%A9%E7%90%86%E7%9F%A5%E8%AF%86 "背景物理知识")背景物理知识

-   反射定律：入射角等于反射角，而且反射光线、入射光线与法向量在同一平面上。  
    [![1560480295590](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560480295590.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560480295590.png)
    
-   折射定律：折射线在入射线与法线构成的平面上，折射角与入射角满足：η1η2\=sinφsinθ，参数是折射率和折射角
    
    [![1560480447843](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560480447843.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560480447843.png)
    
-   能量守恒： Ii\=Id+Is+It+Iv，入射光强=漫反射光强+镜面反射光强+折射光强+吸收光强
    
    -   漫反射光：光线射到物体表面上后（比如泥塑物体的表面，没有一点镜面效果），光线会沿着不同的方向等量的散射出去的现象。漫反射光均匀向各方向传播，与视点无关，它是由表面的粗糙不平引起的。  
        [![1560480565306](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560480565306.png)
        
        1560480565306
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560480565306.png)
    -   镜面反射光：一束光照射到一面镜子上或不绣钢的表面，光线会沿着反射光方向全部反射出去，这种叫镜面反射光。
    -   折射光：比如水晶、玻璃等，光线会穿过去一直往前走。
    -   吸收光：比如冬天晒太阳会感觉到温暖，这是因为吸收了太阳光。

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Phong%E5%85%89%E7%85%A7%E6%A8%A1%E5%9E%8B "Phong光照模型")Phong光照模型

Phong光照模型 = 环境光+漫反射光+镜面反射光

[![1560481251184](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560481251184.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560481251184.png)

单一光源照射下Phong光照模型：I\=IaKa+IpKdcosθ+IpKscosnα

单一光源照射下Phong光照模型常用形式：I\=IaKa+IpKd(L·N)+IpKs(R·V)n

-   I 是景物表面在被照射点处的光亮度，L是已知光源方向，V是视线的方向，R是反射光方向可计算出来，N是物体表面的法向可计算
    
-   环境光，Iambient\=IaKa，Ia环境光强度，Ka环境光反射系数  
    邻近各物体所产生的光的多次反射最终达到平衡时的一种光。可近似认为同一环境下的环境光，其光强分布是均匀的。
    
-   漫反射光，Idiffuse\=IpKd(L·N)，cosθ\=L·N，Ip点光源光强，Ka物体表面漫反射率  
    光照射到比较粗糙的物体表面，物体表面某点的明暗程度不随观测者的位置变化，这种等同地向各个方向散射的现象称为光的漫反射。漫反射光强近似服从Lambert定律
    
-   镜面反射光，Ispec\=IpKs(R·V)n，cosα\=R·V，Ip点光源光强，Ks物体表面镜面反射率，n镜面高光指数，取值1-2000，反映光滑程度  
    光照射到相当光滑的物体表面，产生镜面反射光，其特点是在光滑表面会产生高光区域。
    

结合RGB颜色模型后，{Ir\=IarKar+IprKdr(L·N)+IprKsr(R·V)n Ig\=IagKag+IpgKdg(L·N)+IpgKsg(R·V)n Ib\=IabKab+IpbKdb(L·N)+IpbKsb(R·V)n

Phong模型扫描线算法：其中(r,g,b)\=ka(rpa,gpa,bpa)+∑\[kd(rpd,gpd,bpd)cosθ+ks(rps,gps,bps)cosnα\]

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  

for 屏幕上每一条扫描线y do  
 begin  
 将数组Color初始化成为y扫描线的背景颜色值  
 for y扫描线上的每一可见区间段s中的每个点(x,y) do  
 begin  
 设(x,y)对应的空间可见点为P  
 求出P点处的单位法向量N、P点的单位入射光向量L、单位视线向量V  
 求出L在P点的单位镜面反射向量R  
 (r,g,b) = 代码块外的那个公式  
 置Color(x,y) = (r,g,b)  
 end  
 显示Color  
 end  

Phong示例：

[![1560482563690](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560482563690.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560482563690.png)

[![1560482585216](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560482585216.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560482585216.png)

[![1560482966395](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560482966395.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560482966395.png)

[![1560482998644](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560482998644.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560482998644.png)

[![1560483033546](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560483033546.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560483033546.png)

[![1560483210754](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560483210754.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560483210754.png)

Phong总结：

-   它是真实感图形学中提出的第一个有影响的光照明模型，生成图象的真实度已经达到可以接受的程度。
-   其模拟光从物体表面到观察者眼睛的反射。尽管这种方法符合一些基本的物理法则，但它更多的是基于对现象的观察，所以被看成是一种经验式的方法。
-   实际应用中，这个经验模型还有以下问题
    -   显示出的物体像塑料，无质感变化
    -   没有考虑物体间相互反射光
    -   镜面反射颜色与材质无关
    -   镜面反射入射角大，会产生失真现象

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%A2%9E%E9%87%8F%E5%BC%8F%E5%85%89%E7%85%A7%E6%A8%A1%E5%9E%8B "增量式光照模型")增量式光照模型

光暗处理的必要性：

-   三维物体通常用多边形（三角形）来近似模拟。
-   由于每一个多边形的法向一致，因而多边形内部的象素颜色相同，而且在不同法向的多边形邻接处，光强突变，使具有不同光强的两个相邻区域之间的光强不连续性(马赫带效应)。

[![1560515708469](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560515708469.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560515708469.png)

[![1560518377316](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560518377316.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560518377316.png)

明暗处理

-   思想：每一个多边形的顶点处计算出光照强度或参数，然后在各个多边形内部进行均匀插值
-   方法
    -   Gouraud明暗处理（双线性光强插值算法）
    -   Phong明暗处理（双线性法向插值算法）

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Gouraud%E6%98%8E%E6%9A%97%E5%A4%84%E7%90%86 "Gouraud明暗处理")Gouraud明暗处理

双线性光强插值

算法：

1.  计算多边形顶点的平均法向。  
    与某个顶点相邻的所有多边形的法向平均值近似作为该顶点的近似法向量，顶点A相邻的多边形有k个，它的法向量计算为：  
    Nα\=1k(N1+N2+⋯+Nk)
    
2.  用Phong光照模型计算顶点的光强  
    Phong光照模型出现前，采用如下光照模型计算：  
    I\=IaKa+IpKd(L·Nα)r+k
    

[![1560516640502](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560516640502.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560516640502.png)

3.  插值计算离散边上个点的光强  
    IA\=uI1+(1−u)I2，u\=AV2V1V2 IB\=vI1+(1−v)I3，v\=BV3V1V3

[![1560516728563](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560516728563.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560516728563.png)

4.  插值计算多边形内域中各点的光强  
    Ip\=tIA+(1−t)IB，t\=PBAB  
    求任一点的光强需要进行两次插值计算

扫描线增量思想的优化：  
[![1560517202379](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560517202379.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560517202379.png)

-   离散边上个点的光强  
    IA,j+1\=IA,j+ΔIA IB,j+1\=IB,j+ΔIB ΔIA\=I1−I2y1−y2 ΔIB\=I1−I3y1−y3
-   扫描线内部  
    Ii+1,p\=Ii,p+ΔIp ΔIp\=IB−IAxB−xA

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#Phong%E6%98%8E%E6%9A%97%E5%A4%84%E7%90%86 "Phong明暗处理")Phong明暗处理

Gouraud明暗处理的不足

-   不能有镜面反射光（高光）
-   双线性插值是把能量往四周均匀，平均的结果就是光斑被扩大了，本来没光斑的地方插值后反而出现了光斑。

Phong明暗处理以计算量、时间为代价，引入镜面反射，解决高光问题

算法：

1.  计算每个多边形顶点处的平均单位法矢量（与Gouraud明暗处理方法的第一步相同）
2.  用双线性插值方法求得多边形内部各点的法矢量  
    NA 由 N1 和 N2 线性插值而来  
    NB 由 N1 和 N3 线性插值而来  
    NP 由 NA 和 NB 线性插值而来
3.  按光照模型确定多边形内部各点的光强

[![1560517952742](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560517952742.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560517952742.png)

两种增量式光照模型比较

Phong方法

Gouraud方法

产生的效果高光明显

效果并不明显

高光多位于多边形内部

多边形内部无高光

明暗变化缺乏层次感

光强度变化均匀，与实际效果更接近

计算量大

计算量小

增量式光照模型的不足

-   物体边缘轮廓是折线段而非光滑曲线
-   等间距扫描线会产生不均匀效果
-   插值结果取决于插值方向

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%B1%80%E9%83%A8%E5%85%89%E7%85%A7%E6%A8%A1%E5%9E%8B "局部光照模型")局部光照模型

简单光照模型是一个比较粗糙的经验模型，不足之处在于镜面反射项与物体表面的材质无关

[![1560521245280](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560521245280.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560521245280.png)

局部光照模型

-   仅处理光源直接照射物体表面，不处理物体间反射的影响
-   相对于简单光照模型的优点
    -   基于入射光能量导出的光辐射模型
    -   反映表面的粗糙度对反射光强的影响
    -   高光颜色与材料的物理性质有关
    -   改进入射角很大时的失真现象
    -   考虑了物体材质的影响，可以模拟磨光的金属光泽

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%80 "理论基础")理论基础

光的电磁理论

-   光波是电磁波的一种，自然光照射到物体表面的反射光，其反射率系数 ρ 可由 Fresnel 公式计算：  
    ρ\=12(tg2(θ−ψ)tg2(θ+ψ)+sin2(θ−ψ)sin2(θ+ψ))
-   θ 是入射角， ψ 是折射角， η1，η2是发生反射的物体表面两侧折射率，其中 sinψ\=η1η2sinθ
-   反射率 ρ 与折射率有关，是波长的函数 ρ(θ,λ)

微平面理论

-   将粗糙物体表面看成是由无数个微小的理想镜面组成，这些镜面朝向各异，随机分布，所以可用分布函数去描述
    
-   综合各种原因后，物体的反射率可以这样计算：
    
    -   DGρ(θ,λ)  
        D 为微平面法向的分布函数  
        G 为由于微平面的相互遮挡或屏蔽而使光产生的衰减因子
-   Gauss分布函数模拟法向分布（Torrance和Sparrow两人用Gauss高斯分布来模拟，也可用Berkmann分布）
    
    -   D\=ke−(a/m)2  
        k 为常系数  
        a 为微平面的法向与平均法向的夹角，即 (N·H)  
        m 为微平面斜率的均方根，表示表面的粗糙程度，m\=m12+m22+⋯+mn2n
-   衰减因子 G 也可反映物体表面的粗糙程度
    
    -   G\=min(1,Gm,Gs)  
        下图分别是无遮挡、反射光被遮挡、入射光被遮挡的情况
        
        [![1560520200771](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560520200771.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560520200771.png)
        

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%B1%80%E9%83%A8%E5%85%89%E7%85%A7%E6%98%8E%E6%A8%A1%E5%9E%8B "局部光照明模型")局部光照明模型

Ir 反射光光强

Ei 单位时间内单位面积上的入射光能量

Rbd 物体表面对入射自然光的反射率系数，Rbd\=IrEi

又由于入射光能量 Ei 可表示为 Ei\=Iicosθ·dω\=Ii(N·L)dω

[![1560520636306](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560520636306.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560520636306.png)

故，反射光光强：Ir\=RbdIi(N·L)dω

反射率系数可表示为漫反射率和镜面反射率的代数和：Rbd\=KdRd+KsRs Kd+Ks\=1 Rd\=Rd(λ) Rs\=DGρ(θ,λ)π(N·L)(N·V)

所以局部光照模型表示为：Ir\=IaKa+Ii(N·L)dω(KdRd+KsRs)

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%85%89%E9%80%8F%E5%B0%84%E6%A8%A1%E5%9E%8B "光透射模型")光透射模型

为什么考虑光透射模型：

-   简单和局部光照模型没有考虑光的透射现象
-   其适用于场景中有透明或者半透明的物体的光照处理
-   早期用颜色调和法进行光透射模拟

颜色调和法：

-   I\=t×Ib+(1−t)×Ia
-   不考虑透明体对光的折射以及透明物体本身的厚度，光通过物体表面是不会改变方向的，可以模拟平面玻璃。

[![1560560948610](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560560948610.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560560948610.png)

Whitted 光透射模型

-   提出了第一个整体光照模型，并给出了一般光线跟踪算法的范例，综合考虑了光的反射、折射、透射和阴影等。被认为是计算机图形领域的一个里程碑。
-   即在简单光照明模型的基础上，加上透射光项、镜面反射光项
-   I\=Ia·Ka+Ip·Kd·(L·N)+Ip·Ks·(R·V)n+It‘·Kt‘+Is‘·Ks‘

[![1560561121374](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560561121374.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560561121374.png)

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E6%95%B4%E4%BD%93%E5%85%89%E7%85%A7%E6%A8%A1%E5%9E%8B "整体光照模型")整体光照模型

整体光照模型的诞生：

-   简单和局部光照模型不能很好地模拟光的折射、反射和阴影等，也不能用来表示物体间的相互光照影响。
-   整体光照模型有光线跟踪、辐射度两种方法  
    光线跟踪效果图如下

[![1560562864127](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560562864127.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560562864127.png)

光线跟踪基本过程：

-   如图，点光源 L，透明体 O1,O2 ，不透明体 O3
-   首先，视线 E 从视点出发，过视屏一个像素点，到达球体 O1 交于点 P1
-   交点：从 P1 向光源 L 作一条阴影测试线 S1 ，发现期间没有遮挡的物体，用局部光照模型计算光源对 P1 在其视线 E 方向上的光强作为局部光强
-   在交点产生衍生的光线：
    -   反射光线 R1 方向，没有再与其他物体相交，设该方向的光强为 0，结束 R1 的跟踪
    -   折射光线 T1 方向，与 O1 交于点 P2，由于点在物体内部，假设它的局部光强为 0
        -   反射光线 R2，可递归跟踪下去计算光强
        -   看折射光线 T2，与 O3 交于点 P3，作阴影测试线 S3，无遮挡，计算该点局部光强。并且该点还产生了 R3 可以继续跟踪下去…

[![1560561607895](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560561607895.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560561607895.png)

光线跟踪的停止：

-   该光线未碰到任何物体
-   该光线碰到了背景
-   光线在经过许多次反射和折射以后，就会产生衰减，光线对于视点的光强贡献很小
-   光线反射或折射次数即跟踪深度大于一定值

光线跟踪伪码：

1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
11  
12  
13  
14  
15  
16  
17  
18  

RayTracing(start, direction, weight, ret\_color)  
{  
 if(weight < MinWeight) ret\_color = BLACK;  
 else  
 {  
 计算光线与所有物体的交点中离start最近的点;  
 if(无交点) ret\_color = BLACK;   
 else  
 {  
 I\_local = 在交点处用局部光照模型计算出的光强;  
 计算反射方向R;  
 RayTracing(最近的交点, R, weight\*W\_r, I\_r);  
 计算折射方向T;  
 RayTracing(最近的交点, T, weight\*W\_t, I\_t);  
 ret\_color = I\_local + K\_r \* I\_r + K\_t \* I\_t;  
 }  
 }  
}  

光线跟踪的加速（光线跟踪进行大量的求交运算，效率低）：

-   提高求交速度：针对性的几何算法、…
-   减少求交次数：包围盒、空间索引、八叉树…
    -   包围盒求交测试  
        [![1560562751334](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560562751334.png)
        
        1560562751334
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560562751334.png)
    -   层次包围盒求交测试  
        [![1560562780137](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560562780137.png)
        
        1560562780137
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560562780137.png)
-   减少光线条数：颜色插值、自适应控制、…
-   采用广义光线和采用并行算法等

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%BA%B9%E7%90%86%E6%98%A0%E5%B0%84%E5%92%8C%E9%98%B4%E5%BD%B1%E5%A4%84%E7%90%86 "纹理映射和阴影处理")纹理映射和阴影处理

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%BA%B9%E7%90%86%E6%98%A0%E5%B0%84 "纹理映射")纹理映射

纹理映射的作用：

-   表面用纹理来代替，不用构造模型和材质细节，节省时间和资源
-   可用一个粗糙多边形和纹理来代替详细的几何构造模型，节省时间和资源
-   让用户做其他更重要的东西

[![1560563283932](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560563283932.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560563283932.png)

纹理分类：

-   颜色纹理：颜色或明暗度变化体现出来的表面细节，如刨光木材表面上的木纹。  
    [![1560563325748](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560563325748.png)
    
    1560563325748
    
    ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560563325748.png)
-   几何纹理：由不规则的细小凹凸体现出来的表面细节，如桔子皮表面的皱纹。  
    [![1560563314392](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560563314392.png)
    
    1560563314392
    
    ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560563314392.png)

纹理定义：

-   图象纹理：将二维纹理图案映射到三维物体表面，绘制物体表面上一点时，采用相应的纹理图案中相应点的颜色值
-   函数纹理：用数学函数定义简单的二维纹理图案，如方格地毯；或用数学函数定义随机高度场，生成表面粗糙纹理即几何纹理

[![1560563376530](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560563376530.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560563376530.png)

纹理映射（Texture Mapping）：

-   通过将数字化的纹理图像覆盖或投射到物体表面，而为物体表面增加表面细节的过程
    
-   寻找一种从纹理空间(u,v)到三维曲面(s, t)之间的映射关系，将点(u,v)对应的彩色参数值映射到相应的三维曲面(s, t)上，使三维曲面表面得到彩色图案
    
-   两种方法
    
    -   在绘制一个三角形时，为每个顶点指定纹理坐标，三角形内部点的纹理坐标由纹理三角形的对应点确定。即指定：{(x0,y0,z0)→(u0,v0) (x1,y1,z1)→(u1,v1) (x2,y2,z2)→(u2,v2)
    -   指定映射关系，如 {u\=a0x+a1y+a2z+a3 v\=b0x+b1y+b2z+b3
-   扰动函数 P(u,v)
    
    -   通过对景物表面各采样点的位置作微小扰动来改变表面的微观几何形状。
    -   几何纹理使用一个称为扰动函数的数学函数进行定义。
    -   设景物表面的参数方程 Q\=Q(u,v) ，表面任一点的法线 N\=N(u,v)\=Qu(u,v)×Qv(u,v)|Qu(u,v)×Qv(u,v)|
    -   则扰动后的表面为 Q‘\=Q(u,v)+P(u,v)·N

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E9%98%B4%E5%BD%B1%E5%A4%84%E7%90%86 "阴影处理")阴影处理

阴影的定义：

-   阴影是由于观察方向与光源方向不重合而造成的
-   阴影使人感到画面上景物的远近深浅，从而极大地增强画面的真实感

[![1560564211751](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564211751.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564211751.png)

[![1560564222633](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564222633.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564222633.png)

阴影的概念：

-   本影：不被任何光源所照到的区域Umbra。
-   半影：被部分光源所照到的区域Penumbra

[![1560564277586](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564277586.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564277586.png)

-   自身阴影：由于物体自身的遮挡而使光线照射不到它上面的某些面
-   投射阴影：由于物体遮挡光线，使场景中位于它后面的物体或区域受不到光照射而形成的。

阴影算法——阴影体法（Shadow Volume）：

-   由一个点光源和一个三角形可以生成一个无限大的阴影体。落在这个阴影体中的物体，就处于阴影中。
-   在对光线进行跟踪的过程中，若射线穿过了阴影体的一个正面（朝向视点的面），则计数器加1。若射线穿过了阴影体的一个背面（背向视点的面），则计数器减1。  
    最终计数器大于0，则说明这个像素处于阴影中，否则处于阴影之外。

[![1560564505259](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564505259.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564505259.png)

阴影算法——阴影图法（Shadow Mapping）：

-   思想是使用Z缓冲器算法，从投射阴影的光源位置对整个场景进行绘制。
-   对于Z缓冲器的每一个象素，它的z深度值包括了这个像素到距离光源最近点的物体的距离。一般将Z缓冲器中的整个内容称为阴影图（Shadow Map），有时候也称为阴影深度图。
-   从视点的角度来进行，对场景进行二次绘制。
-   在对每个图元进行绘制的时候，将它们的位置与阴影图进行比较，如果绘制点距离光源比阴影图中的数值还要远，那么这个点就在阴影中，否则就不在阴影中。

[![1560564946515](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564946515.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560564946515.png)

### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E7%BB%98%E5%88%B6%E6%8A%80%E6%9C%AF "绘制技术")绘制技术

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9F%BA%E4%BA%8E%E5%9B%BE%E5%83%8F%E7%9A%84%E7%BB%98%E5%88%B6%E6%8A%80%E6%9C%AFIBR "基于图像的绘制技术IBR")基于图像的绘制技术IBR

IBR，Image-Based Redering

传统图像绘制与IBR比较

[![1560565365988](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565365988.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565365988.png)

传统图像绘制

基于图像的绘制技术

建模复杂、困难

建模简单

计算和显示开销大，绘制速度慢

显示速度快

难以达到真实感效果

真实感强

[![1560565401433](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565401433.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565401433.png)

IBR的发展方向：

-   与传统集合绘制方式有效结合
-   算法固化提高图像生成速度，达到实时绘制
-   分层绘制
-   提高Morphing中特征提取的效率和质量
-   图像拼接中的快速配准

IBR的绘制过程：

[![1560565443104](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565443104.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565443104.png)

IBR绘制中的重要方法：

-   几何和图像混合建模(Hybrid Geometry- and Image-based Approach \[DTM96\])
    
    -   特点
        
        -   可以通过拍摄的几张照片合成逼真的新视图，简单快捷
        -   只能适用于普通建筑物等外形规整的景物
    -   过程
        
        -   a. 拍摄相片，交互指定建筑物边缘
        -   b. 生成建筑物粗模型
        -   c. 利用基于模型的立体视觉算法精化模型
        -   d. 利用基于视点的纹理映射合成新视图
        
        [![1560565533366](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565533366.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565533366.png)
    
-   视图插值和变形(View Interpolation\[CW93\] / View Morphing\[SD96\])
    
    -   特点
        
        -   简单方便，只要求几幅参考图像
        -   漫游范围受限，只能在几幅参考图像的视点连线之间作有限运动
        -   常用于加速图形学中的绘制速度
    -   视图插值方法(View Interpolation)：
        
        [![1560565677246](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565677246.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565677246.png)
        
        -   要求新视点位于两参考图象视点所决定的直线(基线， baseline)上。由参考图线性插值产生新视图。
        -   一般情况下不能产生正确的透视投影结果，而只生成近似的中间视图。
    -   视图变换方法(View Morphing)：
        
        [![1560565749103](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565749103.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560565749103.png)
        
        -   利用参考图像上像素点重投影生成新视图
        -   利用投影知识决定的变形位置
-   全视函数(Plenoptic Function-based)
    
    -   μ\=Plenoptic(θ,ϕ,λ,Vx,Vy,Vz,t)  
        [![1560568775439](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560568775439.png)
        
        1560568775439
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560568775439.png)
-   基于光场的显示(Light Field Rendering\[LH96\] and Lumigraph \[GGSC96\])
    
    -   基于“自由空间中沿一条光线传递的辐射能不变” 的假设，把全视函数简化为描述离开或进入一封闭自由空间(如空立方体)的完全光流分布
    -   由于只考虑视流信息，因此不必对反射属性作假设，不需要立体对应关系
    -   数据量大，采样困难  
        [![1560569404137](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569404137.png)
        
        1560569404137
        
        ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569404137.png)

-   图象拼接(mosaic)
    
    -   全景图(Panorama)
        
        -   在一个视点拍摄的几幅图像，通过整合拼接成一个视点周围的场景视图，投影在圆柱面或者球面上成为全景图。
        -   只需在一个视点拍摄的几张照片，数据量小，采样方便。
        -   视点不能移动，但是可以转动观察方向，通过放大缩小（zoomin/zoom out)进行近似的前后运动  
            [![1560569467655](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569467655.png)
            
            1560569467655
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569467655.png)
    -   同心拼接(Concentric Mosaic)  
        [![1560569539684](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569539684.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569539684.png)
        
        -   通过沿一系列同心圆切线方向拍摄的狭缝图像拼合成同心拼接
            
            [![1560569574287](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569574287.png)](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569574287.png)
            
            
            [![1560569612671](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569612671.png)
            
            1560569612671
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569612671.png)  
            [![1560569644061](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569644061.png)
            
            1560569644061
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569644061.png)
        -   特点：  
            只需在一个圆上拍摄的一系列图像，采样方便  
            视点可以在采样圆内做平面移动，生成场景真实感强  
            数据量较光场等全视函数方法为小  
            移动范围受限，基于狭缝图象的绘制：有场景畸变现象
        
    -   基于狭缝图象段的绘制
        
        -   将同心拼接中使用的狭缝图象进一步分为狭缝图象段
        -   测定不同距离上对应狭缝图象段的伸缩比例
        -   利用狭缝图象段的伸缩进行正确的绘制  
            [![1560569714876](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569714876.png)
            
            1560569714876
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560569714876.png)
-   立体视觉(Stereo Vision)
    

#### [](https://zhangt.top/CS/Computer-Graphics-Study-Notes/#%E5%9F%BA%E4%BA%8E%E7%82%B9%E7%9A%84%E5%BB%BA%E6%A8%A1%E4%B8%8E%E7%BB%98%E5%88%B6 "基于点的建模与绘制")基于点的建模与绘制

Point based Rendering

随着模型多边形复杂度的剧增，点模型的优势越发明显。

点模型的数字几何处理流程：

-   点的获取
    -   3D扫描仪（深度照相机生成的深度图和激光三维扫描仪等设备得到的大量空间三维点位置）
    -   点模型的另一个来源是现有模型 ，大部分几何模型如多边形网格模型、隐式曲面等都能方便地转化为点模型
-   点的处理
    -   配准
        -   机器配准：标签法
        -   自动配准：特征提取法
    -   去噪
        -   移动最小二乘（MLS）曲面逼近原始点集模型
        -   基于三维Meanshift过程的各向异性点模型去噪算法
        -   MLS曲面重建方法
        -   点模型的非局部去噪方法
        -   基于采样保真性的点模型去噪算法
    -   修补
        -   基于上下文的点模型修复  
            [![1560586117047](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560586117047.png)
            
            1560586117047
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560586117047.png)
-   点的建模
    -   目标：从原始点云中构造出一个连续的表面模型
    -   涉及的技术较多，曲面重建、曲面简化、几何属性分析、特征提取、重采样  
        点模型的后期处理则是对点模型作进一步的造型处理：编辑、变形、布尔运算
    -   曲面重建技术
        -   指根据离散扫描点数据重建三维模型的过程
        -   常用方法：  
            RBF(Radial Basis Function)曲面重建方法  
            MLS(Moving Least-Square)曲面
    -   曲面简化技术
        -   利用三维扫描仪获得的点模型通常具有很高的复杂度，为了使大规模数据模型符合几何处理和绘制，必须对数据模型进行简化
    -   点模型编辑技术
        -   对点模型的颜色、纹理等外观属性以及法向量的处理。例如下图是点模型的画刷着色效果图。  
            [![1560586690511](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560586690511.png)
            
            1560586690511
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560586690511.png)
    -   几何造型技术
        -   实体几何造型(CSG：Constructive Solid Geometry)  
            一种基于简单实体的布尔运算构造复杂模型的技术，即通过对多个简单的点模型进行布尔运算后生成复杂的点模型。  
            [![1560586744373](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560586744373.png)
            
            1560586744373
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560586744373.png)
        -   自由变形  
            这种变形技术首先生成一个置换函数 d： R3→R3，然后对表面上的每个点 Pi ，实施变换 Pi→d(Pi)
        -   点模型动画(MFM：Mesh Free Method)  
            力学分析的新方法，近年来研究者将无网格方法和点模型相结合，提出了基于点的动画。例如： 模型形变  
            [![1560586775433](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560586775433.png)
            
            1560586775433
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560586775433.png)
    -   模型渐变(Morphing)技术
        -   点模型自身的特点决定了在模型渐变中，它比基于网格模型的渐变有明显的优势，但由于点模型没有提供表面的解析表达式和参数化信息，从另一方面又增加了它渐变的难度。  
            [![1560587005820](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560587005820.png)
            
            1560587005820
            
            ](https://zhangt.top/CS/Computer-Graphics-Study-Notes/1560587005820.png)
        -   基于物理的渐变  
            需要建立相关物理模型，中间过渡点模型根据能量方程求解，这种渐变在一定程度上模拟了真实的物理现象
        -   基于几何的渐变  
            通过对源和目标模型进行几何变换来获得中间过渡模型，其计算量没有基于物理的渐变大
-   点模型的绘制，如Qsplat技术
    -   由斯坦福大学开发的具有代表性的点绘制技术。
    -   它利用树状层次包围球数据结构，树中每个结点包含球的位置和半径、每点处的法向量、法锥面的宽度、颜色值。
    -   在进行绘制时，层次树按深度优先方法递归遍历。  
        对每个中间结点，首先判断该球是否完全在屏幕外或者是完全背向的，以进行可见性选择。  
        如果该结点至少有一部分子结点是可见的，则将该结点在屏幕上的投影大小同一个阈值进行比较。  
        如果大于阈值，则继续向下递归；  
        如果小于阈值或者已经到达叶结点，则按该结点的球位置及半径确定的屏幕上的位置和大小绘制一个小区域。

基于点的建模与绘制的发展趋势：

-   基于点的自然场景建模
-   基于点模型的动画
-   点模型的简化、压缩和传输
-   基于GPU的大规模点模型绘制
