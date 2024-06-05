package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.car.carplusapp.R
import com.car.carplusapp.adapter.PackageIncludeAdapter
import com.car.carplusapp.adapter.PackagePriceAdapter
import com.car.carplusapp.callbacks.PackageIncludeCallback
import com.car.carplusapp.databinding.FragmentProductDetailBinding
import com.car.carplusapp.datamodels.PackageIncludeData
import com.car.carplusapp.datamodels.PackagePriceData
import com.car.carplusapp.utils.Constant


class ProductDetailFragment : Fragment(), PackageIncludeCallback {

    private lateinit var includeList: MutableList<PackageIncludeData>
    private lateinit var priceList: MutableList<PackagePriceData>
    private lateinit var packageIncludeAdapter: PackageIncludeAdapter
    private lateinit var packagePriceAdapter: PackagePriceAdapter

    private lateinit var mBinding: FragmentProductDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        mBinding = FragmentProductDetailBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {

        includeList = arrayListOf()
        priceList = arrayListOf()

        mBinding.rvPackage.layoutManager = LinearLayoutManager(requireContext())
        mBinding.rvPackage.setHasFixedSize(true)

        mBinding.rvPrice.layoutManager = LinearLayoutManager(requireContext())
        mBinding.rvPackage.setHasFixedSize(true)


        mBinding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        if (Constant.packagePosition == 0){
            mBinding.tvHeading.text = "SAFETY PACKAGE | חבילות"
            mBinding.ivImg.setImageResource(R.drawable.safety)
            mBinding.tvPrice.text = "מחיר מלא- ₪5,605"

            includeList.clear()
            priceList.clear()
            includeList.add(PackageIncludeData("PROOF מצלמת דרך"))
            includeList.add(PackageIncludeData("מערכת חיישנים קדמיים מכורית"))
            includeList.add(PackageIncludeData("בליינד ספוט"))

            priceList.add(PackagePriceData("מחיר לאחר הנחה- ₪4,303"))
            priceList.add(PackagePriceData("מחיר חודשי- ₪119"))

            packageIncludeAdapter = PackageIncludeAdapter(requireContext(), includeList, this)
            mBinding.rvPackage.adapter = packageIncludeAdapter
            packagePriceAdapter = PackagePriceAdapter(requireContext(), priceList)
            mBinding.rvPrice.adapter = packagePriceAdapter

        }

        if (Constant.packagePosition == 1){
            mBinding.tvHeading.text = "ENTERTAINMENT PACKAGE | חבילות"
            mBinding.ivImg.setImageResource(R.drawable.entertainment)
            mBinding.tvPrice.text = " מחיר מלא- ₪8,195"

            includeList.clear()
            priceList.clear()
            includeList.add(PackageIncludeData("מערכת מדיה אחורית"))
            includeList.add(PackageIncludeData("רמקול BT"))
            includeList.add(PackageIncludeData("MKEY מפתח דיגיטלי לרכב שלך"))

            priceList.add(PackagePriceData("מחיר לאחר הנחה- ₪6,290"))
            priceList.add(PackagePriceData("מחיר חודשי- ₪174"))

            packageIncludeAdapter = PackageIncludeAdapter(requireContext(), includeList, this)
            mBinding.rvPackage.adapter = packageIncludeAdapter
            packagePriceAdapter = PackagePriceAdapter(requireContext(), priceList)
            mBinding.rvPrice.adapter = packagePriceAdapter

        }

        if (Constant.packagePosition == 2){
            mBinding.tvHeading.text = " CONVENIENCE PACKAGE | חבילות"
            mBinding.ivImg.setImageResource(R.drawable.convenience_)
            mBinding.tvPrice.text = "מחיר לצרכן- ₪6,885"

            includeList.clear()
            priceList.clear()
            includeList.add(PackageIncludeData("MKEY מפתח דיגיטלי לרכב שלך"))
            includeList.add(PackageIncludeData("PROOF מצלמת דרך"))
            includeList.add(PackageIncludeData("מערכת חיישנים קדמיים מקורית"))
            includeList.add(PackageIncludeData("כרית עור מהודרת כמעמד לטלפון שלך"))

            priceList.add(PackagePriceData("מחיר לאחר הנחה- ₪5,285"))
            priceList.add(PackagePriceData("מחיר חודשי- ₪146"))

            packageIncludeAdapter = PackageIncludeAdapter(requireContext(), includeList, this)
            mBinding.rvPackage.adapter = packageIncludeAdapter
            packagePriceAdapter = PackagePriceAdapter(requireContext(), priceList)
            mBinding.rvPrice.adapter = packagePriceAdapter

        }

        if (Constant.packagePosition == 3){
            mBinding.tvHeading.text = "PREMIUM PACKAGE | חבילות"
            mBinding.ivImg.setImageResource(R.drawable.premium)
            mBinding.tvPrice.text = "מחיר מלא- ₪16,995"

            includeList.clear()
            priceList.clear()
            includeList.add(PackageIncludeData("PROOF מצלמת דרך"))
            includeList.add(PackageIncludeData("MKEY מפתח דיגיטלי לרכב שלך"))
            includeList.add(PackageIncludeData("ריפודי עור בבחירה אישית"))
            includeList.add(PackageIncludeData("כרית עור מהודרת כמעמד לטלפון שלך"))

            priceList.add(PackagePriceData("מחיר לאחר הנחה- ₪13,047"))
            priceList.add(PackagePriceData("מחיר חודשי- ₪362"))

            packageIncludeAdapter = PackageIncludeAdapter(requireContext(), includeList, this)
            mBinding.rvPackage.adapter = packageIncludeAdapter
            packagePriceAdapter = PackagePriceAdapter(requireContext(), priceList)
            mBinding.rvPrice.adapter = packagePriceAdapter

        }

    }

    override fun onPackageInclude(position: Int) {

        if (Constant.packagePosition == 0){
            when (position) {
                0 -> {
                    Constant.packageDetailPosition = 8
                }
                1 -> {
                    Constant.packageDetailPosition = 4
                }
                2 -> {
                    Constant.packageDetailPosition = 1
                }
            }
        }

        if (Constant.packagePosition == 1){
            when (position) {
                0 -> {
                    Constant.packageDetailPosition = 7
                }
                1 -> {
                    Constant.packageDetailPosition = 6
                }
                2 -> {
                    Constant.packageDetailPosition = 5
                }
            }
        }

        if (Constant.packagePosition == 2){
            when (position) {
                0 -> {
                    Constant.packageDetailPosition = 5
                }
                1 -> {
                    Constant.packageDetailPosition = 8
                }
                2 -> {
                    Constant.packageDetailPosition = 4
                }
                3 -> {
                    Constant.packageDetailPosition = 3
                }
            }
        }

        if (Constant.packagePosition == 3){
            when (position) {
                0 -> {
                    Constant.packageDetailPosition = 8
                }
                1 -> {
                    Constant.packageDetailPosition = 5
                }
                2 -> {
                    Constant.packageDetailPosition = 2
                }
                3 -> {
                    Constant.packageDetailPosition = 3
                }
            }
        }



        val action = ProductDetailFragmentDirections.actionProductDetailFragmentToBlindSpotFragment()
        findNavController().navigate(action)
    }
}