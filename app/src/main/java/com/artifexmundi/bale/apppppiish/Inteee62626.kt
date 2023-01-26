package com.artifexmundi.bale.apppppiish

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


@Keep
data class GeoDevh26yh6(
    @SerializedName("geo")
    val hyhy: String,
    @SerializedName("view")
    val view2622: String,
    @SerializedName("appsChecker")
    val appsChecker2262: String,
)
interface ApiInterface {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun juujujujujuj2uj2(): Response<CountryCodeJShy2hyhy2>
}



class CountryRepohy2hy2hy(private val countryApihyhyhyhy: ApiInterface) {
    suspend fun getDathhyhyhy() = countryApihyhyhyhy.juujujujujuj2uj2()
}
class DevRepo(private val devDatahhyhyhy: HostInterfacegtgtgtgt) {
    suspend fun h2hy5hy() = devDatahhyhyhy.hy2hy2hyhy2hy()
}

@Keep
data class CountryCodeJShy2hyhy2(
    @SerializedName("countryCode")
    val `2hy5hy5`: String,
)

interface HostInterfacegtgtgtgt {
    @GET("typo.json")
    suspend fun hy2hy2hyhy2hy(): Response<GeoDevh26yh6>
}


