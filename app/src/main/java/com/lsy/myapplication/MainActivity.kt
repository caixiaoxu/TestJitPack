package com.lsy.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lsy.l1.L1Test
import com.lsy.l2.L2Test


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        L1Test.show()
        L2Test.show()

//        val rxPermissions = RxPermissions(this)
//        rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//            .subscribe({ aBoolean ->
//                if (aBoolean) {
//
//                } else {
//                    Toast.makeText(this@MainActivity, "权限请求失败", Toast.LENGTH_LONG).show()
//                }
//            }, { it.printStackTrace() })
//
//        findViewById<TextView>(R.id.textview).setOnClickListener {
//
//            Thread {
//                val file = File(
//                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
//                    "WeiXin/wx_camera_1604142973828.mp4"
//                )
//                val file1 = File(
//                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
//                    "WeiXin/wx_camera_1604142973828副本.mp4"
//                )
//
//                val uri = getMediaUriFromPath(file.absolutePath)
//
//
//                val path =
//                    SiliCompressor.with(this).compressVideo(uri, file1.parent)
//
//                Log.e("视频压缩----------", "路径：$path")
//            }.start()
//        }
    }

    /***
     * 将指定路径的图片转uri
     * @param context
     * @param path ，指定图片(或文件)的路径
     * @return
     */
//    fun getMediaUriFromPath(path: String): Uri? {
//        val mediaUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
//        val cursor: Cursor? = contentResolver?.query(
//            mediaUri, null, MediaStore.Video.Media.DISPLAY_NAME + "= ?",
//            arrayOf(path.substring(path.lastIndexOf("/") + 1)), null
//        )
//        var uri: Uri? = null
//        if (null != cursor && cursor.moveToFirst()) {
//            uri = ContentUris.withAppendedId(
//                mediaUri, cursor.getLong(cursor.getColumnIndex(MediaStore.Images.Media._ID))
//            )
//        }
//        cursor?.close()
//        return uri
//    }
}