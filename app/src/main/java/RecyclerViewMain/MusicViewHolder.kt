package RecyclerViewMain

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.example.app_lab2.databinding.LayoutItemBinding

class MusicViewHolder private constructor(
    private val binding: LayoutItemBinding
): RecyclerView.ViewHolder(binding.root){
        companion object {
            fun from(parent: ViewGroup):MusicViewHolder{
                val binding = LayoutItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                return MusicViewHolder(binding)
            }
        }
    fun bind(music: Music){
        binding.textView2.text = music.name
        binding.textView3.text = music.singer
    }
}
