package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.car.carplusapp.R
import com.car.carplusapp.adapter.FunctionAdapter
import com.car.carplusapp.adapter.SpecsAdapter
import com.car.carplusapp.callbacks.SpecsCallback
import com.car.carplusapp.databinding.FragmentBlindSpotBinding
import com.car.carplusapp.datamodels.FunctionData
import com.car.carplusapp.datamodels.SpecsData
import com.car.carplusapp.utils.Constant


class BlindSpotFragment : Fragment(), SpecsCallback{

    private lateinit var functionsList: MutableList<FunctionData>
    private lateinit var specsList: MutableList<SpecsData>

    private lateinit var functionAdapter : FunctionAdapter
    private lateinit var specsAdapter: SpecsAdapter

    private lateinit var mBinding: FragmentBlindSpotBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentBlindSpotBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {

        functionsList = arrayListOf()
        specsList = arrayListOf()

        mBinding.rvFunctions.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)
        mBinding.rvFunctions.setHasFixedSize(true)

        mBinding.rvSpecs.layoutManager = LinearLayoutManager(requireContext())
        mBinding.rvSpecs.setHasFixedSize(true)

        mBinding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        if (Constant.packageDetailPosition == 1){
            mBinding.tvHeading.text = "BLIND SPOT | מוצרים"
            mBinding.ivImg.setImageResource(R.drawable.blind_spot_image)
            mBinding.tvTitle.text = "BLIND SPOT -מערכת לזיהוי שטחים מתים"
            mBinding.tvDetail.text = "מערכת ראדר לזיהוי שטחים מתים המורידה דרמטית את הסיכוי שלך להיות מעורב בתאונה\n" +
                    "בליינד ספוט היא מערכת בטיחות מבית איווקס, מבוססת טכנולוגיית רדאר ייחודית מהמתקדמות בעולם. המערכת מנטרת את השטחים המתים שהנהג לא יכול להבחין בהם ו/או לא זוכה לכיסוי מלא או אפקטיבי של המראות. BSD מתריעה באופן קולי וויזואלי כאשר כלי רכב, הולך רגל, אופניים, קורקינט או כל אובייקט אחר יכניס לאזור האחורי או צידי של הרכב."

            functionsList.clear()
            functionsList.add(FunctionData("מפרט טכני"))
            functionsList.add(FunctionData("פונקציות"))




            functionAdapter = FunctionAdapter(requireContext(), functionsList, this)
            mBinding.rvFunctions.adapter = functionAdapter


        }

        if (Constant.packageDetailPosition == 2){
            mBinding.tvHeading.text = "מוצרים|ריפודי עור"
            mBinding.ivImg.setImageResource(R.drawable.car_seats)
            mBinding.tvTitle.text = "John McQueen -ריפודי עור לרכב מבית"
            mBinding.tvDetail.text = "ריפודי העור של John McQueen בהתאמה אישית לרכב מספקים גם עמידות גבוהה נגד לכלוך ונזקי שמש, אך בעיקר מעניקים תחושה של נוחות ויוקרתיות בכל נסיעה.\n" +
                    "העור האיכותי מגיע אל מושבי הרכב שלך ישירות מאיטליה. יחד עם תיפורים מוקפדים וצבע רענן, הרכב יקבל מראה יוקרתי ואקסקלוסיבי."
            functionsList.clear()
            functionsList.add(FunctionData("פונקציות"))

            functionAdapter = FunctionAdapter(requireContext(), functionsList, this)
            mBinding.rvFunctions.adapter = functionAdapter


        }

        if (Constant.packageDetailPosition == 3){
            mBinding.tvHeading.text = "מוצרים | מעמד סמארטפון"
            mBinding.ivImg.setImageResource(R.drawable.img_3)
            mBinding.tvTitle.text = "מעמד סמארטפון לרכב"
            mBinding.tvDetail.text = "מעמד יוקרתי מעור המיועד לסמארטפון, מותאם לכל רכב, בעל תפס מגנטי ושקע טעינה מהיר, המאפשר נהיגה בנוחות ובבטיחות מקסימלית.\n" +
                    "המעמד מתאים לכל טלפון נייד וכולל כרית טעינה בעבודת יד וכבל USB עם 3 שקעים לטעינה מהירה במקביל של לפטופ, סמארטפון וטאבלט. משתלב עם עיצוב הרכב וצבע הדשבורד ליצירת מראה יוקרתי במיוחד.\n" +
                    "*כרית הטעינה בצבע שחור. ניתן לפנות לנציגנו כדי לבדוק אם קיימים צבעים נוספים במלאי."
            functionsList.clear()
            functionsList.add(FunctionData("פונקציות"))
            functionsList.add(FunctionData("מפרט טכני"))


            functionAdapter = FunctionAdapter(requireContext(), functionsList, this)
            mBinding.rvFunctions.adapter = functionAdapter


        }

        if (Constant.packageDetailPosition == 4){
            mBinding.tvHeading.text = "מוצרים | מערכת חיישנים"
            mBinding.ivImg.setImageResource(R.drawable.img_4)
            mBinding.tvTitle.text = "מערכת חיישנים קדמית"
            mBinding.tvDetail.text = "מערכת החיישנים המתקדמת והבטוחה ביותר בעולם, המסייעת לך במהלך החניה באמצעות התראות על מכשולים שנמצאים בסביבת הרכב.\n" +
                    "מערכת החיישנים הקדמית מתאימה גם לרכבים שיש להם חיישני רוורס ומשפרת משמעותית את נוחות החניה ואת בטיחות הרכב והנוסעים בו.\n" +
                    "*התצוגה הגרפית בדגמים תומכים בלבד."
            functionsList.clear()
            functionsList.add(FunctionData("מפרט טכני"))
            functionsList.add(FunctionData("פונקציות"))


            functionAdapter = FunctionAdapter(requireContext(), functionsList, this)
            mBinding.rvFunctions.adapter = functionAdapter


        }

        if (Constant.packageDetailPosition == 5){
            mBinding.tvHeading.text = "MKEY | מוצרים"
            mBinding.ivImg.setImageResource(R.drawable.img_5)
            mBinding.tvTitle.text = "מפתח חכם לרכב - MKEY"
            mBinding.tvDetail.text = "מהפכה בעולם הרכב: נפרדים מהמפתח הפיזי ומתקדמים לשליטה מלאה ברכב באמצעות הסמארטפון!\n" +
                    "בקר MKEY ייחודי ואפליקציה מתקדמת יאפשרו לך לפתוח ולסגור את הדלתות, להניע ולדומם את המנוע, לחסוך אלפי שקלים על שכפול מפתחות לרכב – והכל בטאצ'.\n" +
                    "*ההתקנה מתבצעת על בסיס מפתח \"הספייר\" לרכב.\n" +
                    "*מתאים לרכבים עם כפתור התנעה ולא מפתח מכני"

            functionsList.clear()
            functionsList.add(FunctionData("מפרט טכני"))
            functionsList.add(FunctionData("פונקציות"))


            functionAdapter = FunctionAdapter(requireContext(), functionsList, this)
            mBinding.rvFunctions.adapter = functionAdapter


        }

        if (Constant.packageDetailPosition == 6){
            mBinding.tvHeading.text = "JBL BASS | מוצרים"
            mBinding.ivImg.setImageResource(R.drawable.img_6)
            mBinding.tvTitle.text = "JBL BASS PRO GO - רמקול לרכב"
            mBinding.tvDetail.text = "לנהוג עם חוויית סאונד עוצמתית: רמקול איכותי מבית JBL יאפשר לך ליהנות מאיכות צליל גבוהה, לשלוט על הבסים ואפילו לקחת את המוזיקה איתך אל מחוץ לרכב: לים, לטיולים, לקמפינג ועוד!\n" +
                    "המוצר הראשון מסוגו בעולם המשלב סאב וופר אקטיבי לרכב שניתן להפוך בקלות לרמקול בלוטות' נייד"

            functionsList.clear()
            functionsList.add(FunctionData("מפרט טכני"))
            functionsList.add(FunctionData("פונקציות"))
            functionsList.add(FunctionData("חומרה"))

            functionAdapter = FunctionAdapter(requireContext(), functionsList, this)
            mBinding.rvFunctions.adapter = functionAdapter
        }

        if (Constant.packageDetailPosition == 7){
            mBinding.tvHeading.text = "מוצרים | מערכת מדיה אחורית"
            mBinding.ivImg.setImageResource(R.drawable.img_7)
            mBinding.tvTitle.text = "מערכת מדיה אחורית"
            mBinding.tvDetail.text = "מעכשיו כבר לא משעמם במושבים האחוריים, עם זוג מסכי מדיה שעליהם ניתן לצפות בסרטים וסדרות. שימוש במגוון אפליקציות להנאה מקסימלית בזמן הנסיעה.\n" +
                    "כל מסך מגיע עם ערכת אוזניות אלחוטיות כך שהיושבים מלפנים יכולים להמשיך להאזין לרדיו או למוזיקה כרצונם. אביזר איכותי שעומד בסטנדרטים הגבוהים של יבואן הרכב, ומוצר אידיאלי לנסיעות משפחתיות"

            functionsList.clear()
            functionsList.add(FunctionData("מפרט טכני"))
            functionsList.add(FunctionData("פונקציות"))
            functionsList.add(FunctionData("חומרה"))


            functionAdapter = FunctionAdapter(requireContext(), functionsList, this)
            mBinding.rvFunctions.adapter = functionAdapter


        }
        if (Constant.packageDetailPosition == 8){
            mBinding.tvHeading.text = "PROOF | מוצרים"
            mBinding.ivImg.setImageResource(R.drawable.img_8)
            mBinding.tvTitle.text = "FR400 - PROOF מצלמת דרך"
            mBinding.tvDetail.text = "פסגת טכנולוגיית אבטחת הרכב: מצלמה קדמית ואחורית בעיצוב חדשני ומינימליסטי, שתיתן לך שקט נפשי גם בזמן נהיגה וגם כשהרכב בחניה. תיעוד מלא 24/7 של הרכב וסביבתו באיכות FULL HD, כולל ראיית לילה, הקלטה בזמן נסיעה, צפייה בזמן חניה, זיהוי תקרית בנסיעה או בחניה ושליחת התראות בזמן אמת לאפליקציה ייעודית. המצלמה יכולה לסייע באיתור הרכב, ובמקרה הצורך התיעוד קביל כהוכחה בבית משפט"

            functionsList.clear()

            functionsList.add(FunctionData("מפרט טכני"))
            functionsList.add(FunctionData("פונקציות"))
            functionsList.add(FunctionData("חומרה"))


            functionAdapter = FunctionAdapter(requireContext(), functionsList, this)
            mBinding.rvFunctions.adapter = functionAdapter


        }

    }

    override fun onSpecsClick(position: Int) {

        if (Constant.packageDetailPosition == 1){

            if (position == 0){
                specsList.clear()
                specsList.add(SpecsData("עבודה בטווח טמפרטורה: 40°C~ + 85°C-"))
                specsList.add(SpecsData("אחסון בטווח טמפרטורה: 40°C~ + 85°C-"))
                specsList.add(SpecsData("זווית אנכית: 30 מעלות"))
                specsList.add(SpecsData("זווית אופקית: 150 מעלות"))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 1){
                specsList.clear()
                specsList.add(SpecsData("חסינות למגבלות ראייה וחושך"))
                specsList.add(SpecsData("התראה בנסיעה ברוורס"))
                specsList.add(SpecsData("איתות שמירת מרחק (חיצוני) לרכב מאחור"))
                specsList.add(SpecsData("מערכת אוניברסלית – מתאימה לכל דגמי המכוניות"))
                specsList.add(SpecsData("התראה ויזואלית ושמע (באזר)"))
                specsList.add(SpecsData("טכנולוגיית רדאר"))
                specsList.add(SpecsData("דיוק בכל מזג אוויר"))
                specsList.add(SpecsData("טווח זיהוי עד 27 מטר"))
                specsList.add(SpecsData("עומד בסטנדרט יבואני הרכב"))
                specsList.add(SpecsData("זיהוי מהיר של אובייקטים"))


                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 2){
                specsList.clear()
                specsList.add(SpecsData("מצלמה אחורית 130° באיכות FHD 1080P."))
                specsList.add(SpecsData("עבודה בטווח טמפרטורות 65° -20°."))
                specsList.add(SpecsData("9-34 VDC כניסת מתח.", true))
                specsList.add(SpecsData("משקל נטו 160 גרם."))
                specsList.add(SpecsData("גודל 110/60/42 מ”מ."))
                specsList.add(SpecsData("המערכת מסופקת עם כרטיס זיכרון בנפח של 64GB."))
                specsList.add(SpecsData("המצלמה יכולה להכיל כרטיס זיכרון של עד 2TB."))
                specsList.add(SpecsData(" המערכת מסופקת עם כרטיס SIM – 3 חודשים ראשונים מתנה!"))
                specsList.add(SpecsData("המערכת מסופקת עם כרטיס SIM – 3 חודשים ראשונים מתנה!"))
                specsList.add(SpecsData(" חיישן תנודה מובנה להתראות בזמן אמת G-Sensor KXTJ2-1009."))
                specsList.add(SpecsData("אנטנת GPS מובנית."))


                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }
        }

        if (Constant.packageDetailPosition == 2){

            if (position == 0){

                specsList.clear()
                specsList.add(SpecsData("חידוש וריענון מראה הרכב בעזרת ריפודי עור תוצרת איטליה."))
                specsList.add(SpecsData("ישיבה נוחה עם תחושה יוקרתית, נעימה ומפנקת בכל נסיעה."))
                specsList.add(SpecsData("שישה צבעים לבחירה"))
                specsList.add(SpecsData("אפשרות לבחירת צבעי התיפורים: שחור, לבן או בצבע הריפוד."))


                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

        }

        if (Constant.packageDetailPosition == 3){

            if (position == 0){
                specsList.clear()
                specsList.add(SpecsData(" המעמד אוניברסלי ומתאים לכל סוגי הסמארטפונים"))
                specsList.add(SpecsData(" נוחות מקסימלית של ביצוע שיחות וניווט GPS."))
                specsList.add(SpecsData(" אפשרות להטענת עד שלושה מכשירים בו זמנית."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 1){
                specsList.clear()
                specsList.add(SpecsData(" תפס פטנט מגנטי המאפשר הנחת כל טלפון נייד."))
                specsList.add(SpecsData("2 לוחיות הצמדה (“פלייטים”)."))
                specsList.add(SpecsData("שקע טעינה USB מהיר 2.1 אמפר."))
                specsList.add(SpecsData(" כבל טעינה מהירה המתאים לכל סוגי המכשירים: Type-C, מיקרו USB ו-Lightning"))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

        }

        if (Constant.packageDetailPosition == 4){

            if (position == 0){
                specsList.clear()
                specsList.add(SpecsData("חיישנים קטנים ואסתטיים המתאימים לצבע הרכב."))
                specsList.add(SpecsData("חיישנים אטומים למים."))
                specsList.add(SpecsData("מנגנון המונע טעויות חישוב."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 1){
                specsList.clear()
                specsList.add(SpecsData("הצגה גרפית על גבי המסך המקורי ברכב (בדגמים תומכים)."))
                specsList.add(SpecsData("התראות על מכשולים למניעת פגיעות או שפשופים במהלך החניה."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

        }
        if (Constant.packageDetailPosition == 5){

            if (position == 0){
                specsList.clear()
                specsList.add(SpecsData("כרטיס מאסטר QR: כרטיס בלעדי לחיבור ייעודי בין האפליקציה והבקר."))
                specsList.add(SpecsData("בקר MKEY מאובטח."))
                specsList.add(SpecsData("כבל לשלט."))
                specsList.add(SpecsData("כבל מתח."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 1){
                specsList.clear()
                specsList.add(SpecsData("שליטה בדלתות הרכב: פתיחה ונעילה מרחוק, ברדיוס של עד 100 מ’ בשטח פתוח ועד כ-15 מ’ בסביבה בנויה."))
                specsList.add(SpecsData("התנעה והדממת מנוע ללא צורך במפתח פיזי."))
                specsList.add(SpecsData("שכפול מפתחות חכמים: הקצאת מפתחות דיגיטליים למשתמשים נוספים."))
                specsList.add(SpecsData("אבטחה מקיפה: ניהול הרשאות גישה לרכב."))
                specsList.add(SpecsData("הצגת הטמפרטורה ברכב בכל רגע נתון."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }



        }
        if (Constant.packageDetailPosition == 6){

            if (position == 0){
                specsList.clear()
                specsList.add(SpecsData("סאב וופר עם מגבר בעוצמה של 200 וואט."))
                specsList.add(SpecsData("עוצמת בס 0dB to +6dB."))
                specsList.add(SpecsData("סוללה NiMH, 10.8V/3000mAH."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 1){
                specsList.clear()
                specsList.add(SpecsData("שליטה על עוצמת הבס כשהרמקול מחובר לרכב."))
                specsList.add(SpecsData("איכות צליל גבוהה לחוויית סאונד מקסימלית."))
                specsList.add(SpecsData("סוללה נטענת המספיקה ל-8 שעות מוזיקה מחוץ לרכב."))


                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 2){

                specsList.clear()
                specsList.add(SpecsData("טעינת USB:  5V (2.1A)."))
                specsList.add(SpecsData("Input Sensitivity, Lo-Level: 400mV to 6V.", true))
                specsList.add(SpecsData("Input Sensitivity, Hi-Level: 1V to 15V.", true))
                specsList.add(SpecsData("גרסת בלוטות' 4.2."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

        }
        if (Constant.packageDetailPosition == 7){

            if (position == 0){
                specsList.clear()
                specsList.add(SpecsData("זוג מסכי LED HD 10."))
                specsList.add(SpecsData("אוזניות אלחוטיות בטכנולוגיית Bluetooth לכל מסך."))
                specsList.add(SpecsData("חיבור לחנות Google Play להורדת אפליקציות ומשחקים."))


                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 1){
                specsList.clear()
                specsList.add(SpecsData("אפשרות להקרנת סרטים, סדרות ואפליקציות במהלך הנסיעה."))
                specsList.add(SpecsData("חבילת גלישה ללא הגבלת נפח – 3 חודשים ראשונים מתנה!"))


                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }


            if (position == 2){
                specsList.clear()
                specsList.add(SpecsData("מערכת הפעלה אנדרואיד מלאה."))
                specsList.add(SpecsData("ממשק משתמש בעברית."))
                specsList.add(SpecsData("חיבור מהיר לאינטרנט על גבי רשת 4G."))


                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

        }
        if (Constant.packageDetailPosition == 8){

            if (position == 2){
                specsList.clear()
                specsList.add(SpecsData("4G Frequency FDD-LTE B1/B3/B5/B28.",true))
                specsList.add(SpecsData("Wi-Fi 802.11b/g/n 2.4G (WLAN).",true))
                specsList.add(SpecsData("RAM LPDDR4 1GB RAM.",true))
                specsList.add(SpecsData("Micro SD Card Max 256G.",true))
                specsList.add(SpecsData("GPS Location GPS, A-GPS, BeiDou.",true))
                specsList.add(SpecsData("Memory Flash 4GB.",true))
                specsList.add(SpecsData("CPU MT6761 ARMCortex-A53, 2.0GHz (Quad Core).",true))
                specsList.add(SpecsData("OS Android 9.0.",true))
                specsList.add(SpecsData("Network FDD-LTE(4G), WCDMA(3G), GSM900/1800.",true))
                specsList.add(SpecsData("3G Frequency WCDMA B1/B3.",true))
                specsList.add(SpecsData("Data Service HSDPA, HSPA+, LTE.",true))
                specsList.add(SpecsData("תמיכת ג’י פי אס APP & PC Platform."))
                specsList.add(SpecsData("מנגנון לראיית לילה מיטבית."))
                specsList.add(SpecsData("ניטור וידאו ותמונה מרחוק לאפליקציית PROOF."))
                specsList.add(SpecsData("תמיכה בניגון פלייבק מהאפליקציה PROOF."))
                specsList.add(SpecsData("סטרימינג צפייה בזמן אמת באיכות 108025fps."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 1){
                specsList.clear()
                specsList.add(SpecsData("מצלמה קדמית 140° באיכות FHD 1080P."))
                specsList.add(SpecsData("מצלמת דרך בנסיעה ומצלמת אבטחה בחניה (עם אפשרות הקלטה."))
                specsList.add(SpecsData("צפייה בווידאו בזמן אמת, חזית הרכב ואחורי הרכב באמצעות אפליקציה."))
                specsList.add(SpecsData(" במקרה של זיהוי פגיעה נשלחת התראה בזמן אמת לסמארטפון."))
                specsList.add(SpecsData("אפשרות צפייה בשידור חי דרך האפליקציה מכל מקום בעולם."))
                specsList.add(SpecsData("היסטוריית נסיעות: נתוני מהירות, מיקום ומרחק נסיעה."))
                specsList.add(SpecsData("גידור גאוגרפי: התראות כניסה ויציאה מתחום מוגדר."))
                specsList.add(SpecsData("הקלטת שמע (לבחירת המשתמש)."))

                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

            if (position == 0){
                specsList.clear()
                specsList.add(SpecsData("מצלמה אחורית 130° באיכות FHD 1080P."))
                specsList.add(SpecsData("עבודה בטווח טמפרטורות 65° -20°."))
                specsList.add(SpecsData("9-34 VDC כניסת מתח.",true))
                specsList.add(SpecsData("משקל נטו 160 גרם."))
                specsList.add(SpecsData("גודל 110/60/42 מ”מ."))
                specsList.add(SpecsData("המערכת מסופקת עם כרטיס זיכרון בנפח של 64GB."))
                specsList.add(SpecsData("המצלמה יכולה להכיל כרטיס זיכרון של עד 2TB."))
                specsList.add(SpecsData(" המערכת מסופקת עם כרטיס SIM – 3 חודשים ראשונים מתנה!"))
                specsList.add(SpecsData("המערכת מסופקת עם כרטיס SIM – 3 חודשים ראשונים מתנה!"))
                specsList.add(SpecsData(" חיישן תנודה מובנה להתראות בזמן אמת G-Sensor KXTJ2-1009."))
                specsList.add(SpecsData("אנטנת GPS מובנית."))


                specsAdapter = SpecsAdapter(requireContext(), specsList)
                mBinding.rvSpecs.adapter = specsAdapter

            }

        }
    }

}