package cubex.mahesh.retrofitex_and8am2020.data_classes

import com.google.gson.annotations.SerializedName

data class UserDetails(@SerializedName("Status")
                       val status: Int = 0,
                       @SerializedName("Email")
                       val email: String = "",
                       @SerializedName("UserName")
                       val userName: String = "",
                       @SerializedName("Createdby")
                       val createdby: String = "",
                       @SerializedName("CreatedAt")
                       val createdAt: String = "",
                       @SerializedName("WarehouseId")
                       val warehouseId: Int = 0,
                       @SerializedName("Modifiedby")
                       val modifiedby: String = "",
                       @SerializedName("Name")
                       val name: String = "",
                       @SerializedName("Ideleted")
                       val ideleted: Int = 0,
                       @SerializedName("ModifiedAt")
                       val modifiedAt: String = "",
                       @SerializedName("ObjectState")
                       val objectState: Int = 0,
                       @SerializedName("UserID")
                       val userID: String = "",
                       @SerializedName("LastLogin")
                       val lastLogin: String? = null,
                       @SerializedName("ClientID")
                       val clientID: Int = 0,
                       @SerializedName("PasswordCreate")
                       val passwordCreate: String = "",
                       @SerializedName("LastName")
                       val lastName: String = "",
                       @SerializedName("UserType")
                       val userType: String = "",
                       @SerializedName("Password")
                       val password: String = "")