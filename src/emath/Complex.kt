package emath

import java.math.RoundingMode

class Complex ( re:Number,im:Number){
    var re:Double=re.toDouble()
    var im:Double=im.toDouble()
    var alt:Double
    var deg:Double
    init {
        this.alt=Math.sqrt(this.re*this.re+this.im*this.im)
        deg=Math.atan2(this.im,this.re)
    }

    operator fun plus(addend:Complex)=Complex(this.re+addend.re,this.im+addend.im)
    operator fun minus(minuend:Complex)=Complex(this.re-minuend.re,this.im-minuend.im)
    operator fun times(multiplicand:Complex)=Complex(this.re*multiplicand.re-this.im*multiplicand.im,this.re*multiplicand.im-this.im*multiplicand.re)
    operator fun div(dvidend:Complex):Complex{
        val denominator=dvidend.re*dvidend.re+dvidend.im*dvidend.im
        return Complex((this.re*dvidend.re+this.im*dvidend.im)/denominator,(this.im*dvidend.re-this.re*dvidend.im)/denominator)
    }

    override fun toString(): String {
        return this.re.toBigDecimal().setScale(2,RoundingMode.HALF_UP).toString() + " + j" + this.im.toString().toBigDecimal().setScale(2,RoundingMode.HALF_UP).toString() +
        " = " +  this.alt.toBigDecimal().setScale(2,RoundingMode.HALF_UP).toString() + "∠"  + this.deg.toBigDecimal().setScale(2,RoundingMode.HALF_UP).toString()
    }
}


