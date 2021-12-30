package libcjson

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scalanative.libc.*

object predef:  
  abstract class CEnum[T](using eq: T =:= Int):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (t: T) def int: CInt = eq.apply(t)
  
  abstract class CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
        
object types:
  import predef.*
  type __darwin_mach_port_t = __darwin_mach_port_name_t
  object __darwin_mach_port_t: 
    given _tag: Tag[__darwin_mach_port_t] = __darwin_mach_port_name_t._tag

  opaque type int16_t = CShort
  object int16_t: 
    given _tag: Tag[int16_t] = Tag.Short
    inline def apply(inline o: CShort): int16_t = o

  type __darwin_ino64_t = __uint64_t
  object __darwin_ino64_t: 
    given _tag: Tag[__darwin_ino64_t] = __uint64_t._tag

  opaque type __darwin_ssize_t = CLongInt
  object __darwin_ssize_t: 
    given _tag: Tag[__darwin_ssize_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_ssize_t = o

  opaque type __uint64_t = CUnsignedLongLong
  object __uint64_t: 
    given _tag: Tag[__uint64_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongLong): __uint64_t = o

  opaque type __darwin_time_t = CLongInt
  object __darwin_time_t: 
    given _tag: Tag[__darwin_time_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_time_t = o

  type user_long_t = int64_t
  object user_long_t: 
    given _tag: Tag[user_long_t] = int64_t._tag

  type __darwin_useconds_t = __uint32_t
  object __darwin_useconds_t: 
    given _tag: Tag[__darwin_useconds_t] = __uint32_t._tag

  type user_size_t = u_int64_t
  object user_size_t: 
    given _tag: Tag[user_size_t] = u_int64_t._tag

  type user_addr_t = u_int64_t
  object user_addr_t: 
    given _tag: Tag[user_addr_t] = u_int64_t._tag

  type __darwin_socklen_t = __uint32_t
  object __darwin_socklen_t: 
    given _tag: Tag[__darwin_socklen_t] = __uint32_t._tag

  opaque type __int8_t = CChar
  object __int8_t: 
    given _tag: Tag[__int8_t] = Tag.Byte
    inline def apply(inline o: CChar): __int8_t = o

  type rsize_t = __darwin_size_t
  object rsize_t: 
    given _tag: Tag[rsize_t] = __darwin_size_t._tag

  opaque type uintptr_t = CUnsignedLongInt
  object uintptr_t: 
    given _tag: Tag[uintptr_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): uintptr_t = o

  type __darwin_wctype_t = __uint32_t
  object __darwin_wctype_t: 
    given _tag: Tag[__darwin_wctype_t] = __uint32_t._tag

  type wint_t = __darwin_wint_t
  object wint_t: 
    given _tag: Tag[wint_t] = __darwin_wint_t._tag

  type user_time_t = int64_t
  object user_time_t: 
    given _tag: Tag[user_time_t] = int64_t._tag

  type intptr_t = __darwin_intptr_t
  object intptr_t: 
    given _tag: Tag[intptr_t] = __darwin_intptr_t._tag

  type __darwin_id_t = __uint32_t
  object __darwin_id_t: 
    given _tag: Tag[__darwin_id_t] = __uint32_t._tag

  type __darwin_mach_port_name_t = __darwin_natural_t
  object __darwin_mach_port_name_t: 
    given _tag: Tag[__darwin_mach_port_name_t] = __darwin_natural_t._tag

  type __darwin_off_t = __int64_t
  object __darwin_off_t: 
    given _tag: Tag[__darwin_off_t] = __int64_t._tag

  opaque type __darwin_fsfilcnt_t = CUnsignedInt
  object __darwin_fsfilcnt_t: 
    given _tag: Tag[__darwin_fsfilcnt_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __darwin_fsfilcnt_t = o

  opaque type cJSON_bool = CInt
  object cJSON_bool: 
    given _tag: Tag[cJSON_bool] = Tag.Int
    inline def apply(inline o: CInt): cJSON_bool = o

  opaque type __int16_t = CShort
  object __int16_t: 
    given _tag: Tag[__int16_t] = Tag.Short
    inline def apply(inline o: CShort): __int16_t = o

  type wchar_t = __darwin_wchar_t
  object wchar_t: 
    given _tag: Tag[wchar_t] = __darwin_wchar_t._tag

  opaque type __int64_t = CLongLong
  object __int64_t: 
    given _tag: Tag[__int64_t] = Tag.Long
    inline def apply(inline o: CLongLong): __int64_t = o

  opaque type __uint32_t = CUnsignedInt
  object __uint32_t: 
    given _tag: Tag[__uint32_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __uint32_t = o

  type __darwin_blksize_t = __int32_t
  object __darwin_blksize_t: 
    given _tag: Tag[__darwin_blksize_t] = __int32_t._tag

  type register_t = int64_t
  object register_t: 
    given _tag: Tag[register_t] = int64_t._tag

  opaque type u_int32_t = CUnsignedInt
  object u_int32_t: 
    given _tag: Tag[u_int32_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): u_int32_t = o

  type __darwin_blkcnt_t = __int64_t
  object __darwin_blkcnt_t: 
    given _tag: Tag[__darwin_blkcnt_t] = __int64_t._tag

  type __darwin_gid_t = __uint32_t
  object __darwin_gid_t: 
    given _tag: Tag[__darwin_gid_t] = __uint32_t._tag

  opaque type max_align_t = Double
  object max_align_t: 
    given _tag: Tag[max_align_t] = Tag.Double
    inline def apply(inline o: Double): max_align_t = o

  type __darwin_sigset_t = __uint32_t
  object __darwin_sigset_t: 
    given _tag: Tag[__darwin_sigset_t] = __uint32_t._tag

  opaque type __darwin_ct_rune_t = CInt
  object __darwin_ct_rune_t: 
    given _tag: Tag[__darwin_ct_rune_t] = Tag.Int
    inline def apply(inline o: CInt): __darwin_ct_rune_t = o

  opaque type __builtin_va_list = Ptr[CChar]
  object __builtin_va_list: 
    given _tag: Tag[__builtin_va_list] = Tag.Ptr[CChar](Tag.Byte)
    inline def apply(inline o: Ptr[CChar]): __builtin_va_list = o

  type syscall_arg_t = u_int64_t
  object syscall_arg_t: 
    given _tag: Tag[syscall_arg_t] = u_int64_t._tag

  opaque type int8_t = CChar
  object int8_t: 
    given _tag: Tag[int8_t] = Tag.Byte
    inline def apply(inline o: CChar): int8_t = o

  opaque type __darwin_uuid_t = CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]
  object __darwin_uuid_t: 
    given _tag: Tag[__darwin_uuid_t] = Tag.CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]](Tag.UByte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
    inline def apply(inline o: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]): __darwin_uuid_t = o

  type user_off_t = int64_t
  object user_off_t: 
    given _tag: Tag[user_off_t] = int64_t._tag

  type __darwin_dev_t = __int32_t
  object __darwin_dev_t: 
    given _tag: Tag[__darwin_dev_t] = __int32_t._tag

  type __darwin_mbstate_t = __mbstate_t
  object __darwin_mbstate_t: 
    given _tag: Tag[__darwin_mbstate_t] = __mbstate_t._tag

  opaque type __darwin_clock_t = CUnsignedLongInt
  object __darwin_clock_t: 
    given _tag: Tag[__darwin_clock_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): __darwin_clock_t = o

  type __darwin_mode_t = __uint16_t
  object __darwin_mode_t: 
    given _tag: Tag[__darwin_mode_t] = __uint16_t._tag

  opaque type u_int8_t = CUnsignedChar
  object u_int8_t: 
    given _tag: Tag[u_int8_t] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): u_int8_t = o
  type size_t = __darwin_size_t
  object size_t: 
    given _tag: Tag[size_t] = __darwin_size_t._tag

  opaque type __uint16_t = CUnsignedShort
  object __uint16_t: 
    given _tag: Tag[__uint16_t] = Tag.UShort
    inline def apply(inline o: CUnsignedShort): __uint16_t = o

  opaque type __darwin_intptr_t = CLongInt
  object __darwin_intptr_t: 
    given _tag: Tag[__darwin_intptr_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_intptr_t = o

  opaque type __darwin_nl_item = CInt
  object __darwin_nl_item: 
    given _tag: Tag[__darwin_nl_item] = Tag.Int
    inline def apply(inline o: CInt): __darwin_nl_item = o

  type __darwin_rune_t = __darwin_wchar_t
  object __darwin_rune_t: 
    given _tag: Tag[__darwin_rune_t] = __darwin_wchar_t._tag

  opaque type __darwin_pthread_key_t = CUnsignedLongInt
  object __darwin_pthread_key_t: 
    given _tag: Tag[__darwin_pthread_key_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): __darwin_pthread_key_t = o

  opaque type int64_t = CLongLong
  object int64_t: 
    given _tag: Tag[int64_t] = Tag.Long
    inline def apply(inline o: CLongLong): int64_t = o

  opaque type __darwin_fsblkcnt_t = CUnsignedInt
  object __darwin_fsblkcnt_t: 
    given _tag: Tag[__darwin_fsblkcnt_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __darwin_fsblkcnt_t = o

  opaque type __darwin_wctrans_t = CInt
  object __darwin_wctrans_t: 
    given _tag: Tag[__darwin_wctrans_t] = Tag.Int
    inline def apply(inline o: CInt): __darwin_wctrans_t = o

  type ptrdiff_t = __darwin_ptrdiff_t
  object ptrdiff_t: 
    given _tag: Tag[ptrdiff_t] = __darwin_ptrdiff_t._tag

  type user_ssize_t = int64_t
  object user_ssize_t: 
    given _tag: Tag[user_ssize_t] = int64_t._tag

  opaque type __uint8_t = CUnsignedChar
  object __uint8_t: 
    given _tag: Tag[__uint8_t] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): __uint8_t = o

  type __darwin_uid_t = __uint32_t
  object __darwin_uid_t: 
    given _tag: Tag[__darwin_uid_t] = __uint32_t._tag

  type __darwin_suseconds_t = __int32_t
  object __darwin_suseconds_t: 
    given _tag: Tag[__darwin_suseconds_t] = __int32_t._tag

  type user_ulong_t = u_int64_t
  object user_ulong_t: 
    given _tag: Tag[user_ulong_t] = u_int64_t._tag

  opaque type __darwin_wchar_t = CInt
  object __darwin_wchar_t: 
    given _tag: Tag[__darwin_wchar_t] = Tag.Int
    inline def apply(inline o: CInt): __darwin_wchar_t = o

  opaque type __int32_t = CInt
  object __int32_t: 
    given _tag: Tag[__int32_t] = Tag.Int
    inline def apply(inline o: CInt): __int32_t = o

  opaque type u_int64_t = CUnsignedLongLong
  object u_int64_t: 
    given _tag: Tag[u_int64_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongLong): u_int64_t = o

  opaque type int32_t = CInt
  object int32_t: 
    given _tag: Tag[int32_t] = Tag.Int
    inline def apply(inline o: CInt): int32_t = o

  type __darwin_pid_t = __int32_t
  object __darwin_pid_t: 
    given _tag: Tag[__darwin_pid_t] = __int32_t._tag

  opaque type __darwin_natural_t = CUnsignedInt
  object __darwin_natural_t: 
    given _tag: Tag[__darwin_natural_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __darwin_natural_t = o

  opaque type __darwin_ptrdiff_t = CLongInt
  object __darwin_ptrdiff_t: 
    given _tag: Tag[__darwin_ptrdiff_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_ptrdiff_t = o

  opaque type __darwin_size_t = CUnsignedLongInt
  object __darwin_size_t: 
    given _tag: Tag[__darwin_size_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): __darwin_size_t = o

  type __darwin_ino_t = __darwin_ino64_t
  object __darwin_ino_t: 
    given _tag: Tag[__darwin_ino_t] = __darwin_ino64_t._tag

  type __darwin_va_list = __builtin_va_list
  object __darwin_va_list: 
    given _tag: Tag[__darwin_va_list] = __builtin_va_list._tag

  opaque type __darwin_wint_t = CInt
  object __darwin_wint_t: 
    given _tag: Tag[__darwin_wint_t] = Tag.Int
    inline def apply(inline o: CInt): __darwin_wint_t = o

  opaque type u_int16_t = CUnsignedShort
  object u_int16_t: 
    given _tag: Tag[u_int16_t] = Tag.UShort
    inline def apply(inline o: CUnsignedShort): u_int16_t = o

  opaque type __darwin_pthread_t = Ptr[_opaque_pthread_t]
  object __darwin_pthread_t: 
    given _tag: Tag[__darwin_pthread_t] = Tag.Ptr[_opaque_pthread_t](_opaque_pthread_t._tag)
    inline def apply(inline o: Ptr[_opaque_pthread_t]): __darwin_pthread_t = o

  opaque type __darwin_uuid_string_t = CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._7]]
  object __darwin_uuid_string_t: 
    given _tag: Tag[__darwin_uuid_string_t] = Tag.CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._7]](Tag.UByte, Tag.Digit2[Nat._3, Nat._7](Tag.Nat3, Tag.Nat7))
    inline def apply(inline o: CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._7]]): __darwin_uuid_string_t = o

  opaque type __darwin_pthread_once_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat._8]]
  object __darwin_pthread_once_t:
    given _tag: Tag[__darwin_pthread_once_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat._8]]
    extension (struct: __darwin_pthread_once_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat._8] = struct._2

  opaque type __darwin_pthread_mutexattr_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat._8]]
  object __darwin_pthread_mutexattr_t:
    given _tag: Tag[__darwin_pthread_mutexattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat._8]]
    extension (struct: __darwin_pthread_mutexattr_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat._8] = struct._2

  opaque type __darwin_pthread_handler_rec = CStruct3[Ptr[CFuncPtr1[Ptr[Byte], Unit]], Ptr[Byte], Ptr[Byte]]
  object __darwin_pthread_handler_rec:
    given _tag: Tag[__darwin_pthread_handler_rec] = Tag.materializeCStruct3Tag[Ptr[CFuncPtr1[Ptr[Byte], Unit]], Ptr[Byte], Ptr[Byte]]
    extension (struct: __darwin_pthread_handler_rec)
      def __routine: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = struct._1
      def __arg: Ptr[Byte] = struct._2
      def __next: Ptr[__darwin_pthread_handler_rec] = struct._3.asInstanceOf[Ptr[__darwin_pthread_handler_rec]]

  opaque type _opaque_pthread_once_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat._8]]
  object _opaque_pthread_once_t:
    given _tag: Tag[_opaque_pthread_once_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat._8]]
    extension (struct: _opaque_pthread_once_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat._8] = struct._2
  opaque type _opaque_pthread_condattr_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat._8]]
  object _opaque_pthread_condattr_t:
    given _tag: Tag[_opaque_pthread_condattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat._8]]
    extension (struct: _opaque_pthread_condattr_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat._8] = struct._2

  opaque type _opaque_pthread_rwlock_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]]
  object _opaque_pthread_rwlock_t:
    given _tag: Tag[_opaque_pthread_rwlock_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]]
    extension (struct: _opaque_pthread_rwlock_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]] = struct._2

  opaque type __darwin_pthread_rwlock_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]]
  object __darwin_pthread_rwlock_t:
    given _tag: Tag[__darwin_pthread_rwlock_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]]
    extension (struct: __darwin_pthread_rwlock_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]] = struct._2

  opaque type __darwin_pthread_cond_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._0]]]
  object __darwin_pthread_cond_t:
    given _tag: Tag[__darwin_pthread_cond_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._0]]]
    extension (struct: __darwin_pthread_cond_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._0]] = struct._2

  opaque type _opaque_pthread_cond_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._0]]]
  object _opaque_pthread_cond_t:
    given _tag: Tag[_opaque_pthread_cond_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._0]]]
    extension (struct: _opaque_pthread_cond_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._0]] = struct._2

  opaque type cJSON = CStruct8[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt, Ptr[CUnsignedChar], CInt, Double, Ptr[CUnsignedChar]]
  object cJSON:
    given _tag: Tag[cJSON] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt, Ptr[CUnsignedChar], CInt, Double, Ptr[CUnsignedChar]]
    extension (struct: cJSON)
      def next: Ptr[cJSON] = struct._1.asInstanceOf[Ptr[cJSON]]
      def prev: Ptr[cJSON] = struct._2.asInstanceOf[Ptr[cJSON]]
      def child: Ptr[cJSON] = struct._3.asInstanceOf[Ptr[cJSON]]
      def `type`: CInt = struct._4
      def valuestring: Ptr[CUnsignedChar] = struct._5
      def valueint: CInt = struct._6
      def valuedouble: Double = struct._7
      def string: Ptr[CUnsignedChar] = struct._8

  opaque type _opaque_pthread_mutex_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]]]
  object _opaque_pthread_mutex_t:
    given _tag: Tag[_opaque_pthread_mutex_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]]]
    extension (struct: _opaque_pthread_mutex_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]] = struct._2

  opaque type __darwin_pthread_mutex_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]]]
  object __darwin_pthread_mutex_t:
    given _tag: Tag[__darwin_pthread_mutex_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]]]
    extension (struct: __darwin_pthread_mutex_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]] = struct._2

  opaque type cJSON_Hooks = CStruct2[Ptr[CFuncPtr1[size_t, Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Unit]]]
  object cJSON_Hooks:
    given _tag: Tag[cJSON_Hooks] = Tag.materializeCStruct2Tag[Ptr[CFuncPtr1[size_t, Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Unit]]]
    extension (struct: cJSON_Hooks)
      def malloc_fn: Ptr[CFuncPtr1[size_t, Ptr[Byte]]] = struct._1
      def free_fn: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = struct._2

  opaque type __darwin_pthread_rwlockattr_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]]
  object __darwin_pthread_rwlockattr_t:
    given _tag: Tag[__darwin_pthread_rwlockattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]]
    extension (struct: __darwin_pthread_rwlockattr_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]] = struct._2

  opaque type __darwin_pthread_attr_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]]]
  object __darwin_pthread_attr_t:
    given _tag: Tag[__darwin_pthread_attr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]]]
    extension (struct: __darwin_pthread_attr_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]] = struct._2

  opaque type _opaque_pthread_mutexattr_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat._8]]
  object _opaque_pthread_mutexattr_t:
    given _tag: Tag[_opaque_pthread_mutexattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat._8]]
    extension (struct: _opaque_pthread_mutexattr_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat._8] = struct._2

  opaque type _opaque_pthread_t = CStruct3[CLongInt, Ptr[__darwin_pthread_handler_rec], CArray[CUnsignedChar, Nat.Digit4[Nat._8, Nat._1, Nat._7, Nat._6]]]
  object _opaque_pthread_t:
    given _tag: Tag[_opaque_pthread_t] = Tag.materializeCStruct3Tag[CLongInt, Ptr[__darwin_pthread_handler_rec], CArray[CUnsignedChar, Nat.Digit4[Nat._8, Nat._1, Nat._7, Nat._6]]]
    extension (struct: _opaque_pthread_t)
      def __sig: CLongInt = struct._1
      def __cleanup_stack: Ptr[__darwin_pthread_handler_rec] = struct._2
      def __opaque: CArray[CUnsignedChar, Nat.Digit4[Nat._8, Nat._1, Nat._7, Nat._6]] = struct._3

  opaque type _opaque_pthread_attr_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]]]
  object _opaque_pthread_attr_t:
    given _tag: Tag[_opaque_pthread_attr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]]]
    extension (struct: _opaque_pthread_attr_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit2[Nat._5, Nat._6]] = struct._2

  opaque type _opaque_pthread_rwlockattr_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]]
  object _opaque_pthread_rwlockattr_t:
    given _tag: Tag[_opaque_pthread_rwlockattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]]
    extension (struct: _opaque_pthread_rwlockattr_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]] = struct._2

  opaque type __darwin_pthread_condattr_t = CStruct2[CLongInt, CArray[CUnsignedChar, Nat._8]]
  object __darwin_pthread_condattr_t:
    given _tag: Tag[__darwin_pthread_condattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CUnsignedChar, Nat._8]]
    extension (struct: __darwin_pthread_condattr_t)
      def __sig: CLongInt = struct._1
      def __opaque: CArray[CUnsignedChar, Nat._8] = struct._2

  opaque type __mbstate_t = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
  object __mbstate_t:
    given _tag: Tag[__mbstate_t] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
    extension (struct: __mbstate_t)
      def __mbstate8: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]] = !struct.at(0).asInstanceOf[Ptr[CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]]]
      def _mbstateL: CLongLong = !struct.at(0).asInstanceOf[Ptr[CLongLong]]

@extern
object functions: 
  import types.*

  def cJSON_AddItemReferenceToArray(array: Ptr[cJSON], item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_AddRawToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar], raw: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_CreateRaw(raw: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_Version(): Ptr[CUnsignedChar] = extern

  def cJSON_CreateNull(): Ptr[cJSON] = extern

  def cJSON_CreateString(string: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_DeleteItemFromObjectCaseSensitive(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar]): Unit = extern

  def cJSON_AddNullToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_DeleteItemFromArray(array: Ptr[cJSON], which: CInt): Unit = extern

  def cJSON_CreateStringReference(string: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_PrintPreallocated(item: Ptr[cJSON], buffer: Ptr[CUnsignedChar], length: CInt, format: cJSON_bool): cJSON_bool = extern

  def cJSON_IsNull(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_GetNumberValue(item: Ptr[cJSON]): Double = extern

  def cJSON_InitHooks(hooks: Ptr[cJSON_Hooks]): Unit = extern

  def cJSON_IsInvalid(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_AddItemToArray(array: Ptr[cJSON], item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_AddObjectToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_DetachItemFromObjectCaseSensitive(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_GetObjectItemCaseSensitive(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_Print(item: Ptr[cJSON]): Ptr[CUnsignedChar] = extern

  def cJSON_CreateArray(): Ptr[cJSON] = extern

  def cJSON_CreateTrue(): Ptr[cJSON] = extern

  def cJSON_InsertItemInArray(array: Ptr[cJSON], which: CInt, newitem: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_GetErrorPtr(): Ptr[CUnsignedChar] = extern

  def cJSON_CreateDoubleArray(numbers: Ptr[Double], count: CInt): Ptr[cJSON] = extern

  def cJSON_IsTrue(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_CreateObjectReference(child: Ptr[cJSON]): Ptr[cJSON] = extern

  def cJSON_CreateIntArray(numbers: Ptr[CInt], count: CInt): Ptr[cJSON] = extern

  def cJSON_IsFalse(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_PrintUnformatted(item: Ptr[cJSON]): Ptr[CUnsignedChar] = extern

  def cJSON_SetValuestring(`object`: Ptr[cJSON], valuestring: Ptr[CUnsignedChar]): Ptr[CUnsignedChar] = extern

  def cJSON_AddNumberToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar], number: Double): Ptr[cJSON] = extern

  def cJSON_AddItemToObject(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar], item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_CreateBool(boolean: cJSON_bool): Ptr[cJSON] = extern

  def cJSON_DetachItemViaPointer(parent: Ptr[cJSON], item: Ptr[cJSON]): Ptr[cJSON] = extern

  def cJSON_ReplaceItemInObject(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar], newitem: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_AddArrayToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_AddBoolToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar], boolean: cJSON_bool): Ptr[cJSON] = extern

  def cJSON_AddTrueToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_AddItemReferenceToObject(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar], item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_CreateFalse(): Ptr[cJSON] = extern

  def cJSON_GetArrayItem(array: Ptr[cJSON], index: CInt): Ptr[cJSON] = extern

  def cJSON_IsBool(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_DeleteItemFromObject(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar]): Unit = extern

  def cJSON_DetachItemFromObject(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_AddStringToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar], string: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_CreateStringArray(strings: Ptr[Ptr[CUnsignedChar]], count: CInt): Ptr[cJSON] = extern

  def cJSON_ParseWithLength(value: Ptr[CUnsignedChar], buffer_length: size_t): Ptr[cJSON] = extern
  def cJSON_SetNumberHelper(`object`: Ptr[cJSON], number: Double): Double = extern

  def cJSON_GetStringValue(item: Ptr[cJSON]): Ptr[CUnsignedChar] = extern

  def cJSON_ReplaceItemViaPointer(parent: Ptr[cJSON], item: Ptr[cJSON], replacement: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_IsNumber(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_CreateNumber(num: Double): Ptr[cJSON] = extern

  def cJSON_Compare(a: Ptr[cJSON], b: Ptr[cJSON], case_sensitive: cJSON_bool): cJSON_bool = extern

  def cJSON_CreateArrayReference(child: Ptr[cJSON]): Ptr[cJSON] = extern

  def cJSON_ParseWithLengthOpts(value: Ptr[CUnsignedChar], buffer_length: size_t, return_parse_end: Ptr[Ptr[CUnsignedChar]], require_null_terminated: cJSON_bool): Ptr[cJSON] = extern

  def cJSON_DetachItemFromArray(array: Ptr[cJSON], which: CInt): Ptr[cJSON] = extern

  def cJSON_Duplicate(item: Ptr[cJSON], recurse: cJSON_bool): Ptr[cJSON] = extern

  def cJSON_ParseWithOpts(value: Ptr[CUnsignedChar], return_parse_end: Ptr[Ptr[CUnsignedChar]], require_null_terminated: cJSON_bool): Ptr[cJSON] = extern

  def cJSON_CreateObject(): Ptr[cJSON] = extern

  def cJSON_Minify(json: Ptr[CUnsignedChar]): Unit = extern

  def cJSON_HasObjectItem(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar]): cJSON_bool = extern

  def cJSON_malloc(size: size_t): Ptr[Byte] = extern

  def cJSON_Parse(value: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_CreateFloatArray(numbers: Ptr[Float], count: CInt): Ptr[cJSON] = extern

  def cJSON_free(`object`: Ptr[Byte]): Unit = extern

  def cJSON_IsRaw(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_IsArray(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_GetArraySize(array: Ptr[cJSON]): CInt = extern

  def cJSON_IsString(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_ReplaceItemInArray(array: Ptr[cJSON], which: CInt, newitem: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_AddItemToObjectCS(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar], item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_IsObject(item: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_AddFalseToObject(`object`: Ptr[cJSON], name: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_GetObjectItem(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar]): Ptr[cJSON] = extern

  def cJSON_PrintBuffered(item: Ptr[cJSON], prebuffer: CInt, fmt: cJSON_bool): Ptr[CUnsignedChar] = extern

  def cJSON_ReplaceItemInObjectCaseSensitive(`object`: Ptr[cJSON], string: Ptr[CUnsignedChar], newitem: Ptr[cJSON]): cJSON_bool = extern

  def cJSON_Delete(item: Ptr[cJSON]): Unit = extern


