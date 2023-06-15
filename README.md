# ViewBindingKtx
使用委托对ViewBinding进行封装

### 使用方式

```implementation 'io.github.myusernamehsw:ViewBindingKtx:1.0.0'```

#### Activity

```kotlin
class MainActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivityMainBinding>()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
 }
```

#### Fragment

```kotlin
class BindFragment : Fragment(R.layout.fragment_bind) {
    private val binding by viewBinding<FragmentBindBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvText.setOnClickListener {
            
        }
    }
}
```

#### ViewGroup

```kotlin
class BindView @JvmOverloads constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int = 0): FrameLayout(context, attrs, defStyleAttr) {
    private val binding by viewBinding<ViewBindBinding>()
    init {
        binding.tvView.text = "text"
    }
}
```

