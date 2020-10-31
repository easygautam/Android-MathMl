package com.easygautam.sample.mathmlview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


private const val html = "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\n" +
        "\n" +
        "<p style=\"text-align: center;\"><math xmlns=\"http://www.w3.org/1998/Math/MathML\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\n" +
        "\n" +
        "<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\n" +
        "\n" +
        "<p style=\"text-align: center;\"><math class=\"wrs_chemistry\" xmlns=\"http://www.w3.org/1998/Math/MathML\"><mn>2</mn><msub><mi mathvariant=\"normal\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\"normal\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\"normal\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\"normal\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\"normal\">H</mi><mn>2</mn></msub><mi mathvariant=\"normal\">O</mi><mfenced><mi mathvariant=\"normal\">l</mi></mfenced></math></p>\n" +
        "\n" +
        "<p>The entire formula for the surface area of a cylinder is <math xmlns=\"http://www.w3.org/1998/Math/MathML\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>" +
        "" +
        "<p>In elementary algebra, the <b>quadratic formula</b> is the solution of the quadratic equation.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mi>x</mi><mo>=</mo><mfrac><mrow><mo>-</mo><mi>b</mi><mo>±</mo><msqrt><msup><mi>b</mi><mn>2</mn></msup><mo>-</mo><mn>4</mn><mi>a</mi><mi>c</mi></msqrt></mrow><mrow><mn>2</mn><mi>a</mi></mrow></mfrac></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p><b>Water is made from two elements</b> - Hydrogen and Oxygen. If you put the two gases together, along with energy, you can make water.</p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p style=\\\"text-align: center;\\\"><math class=\\\"wrs_chemistry\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>+</mo><msub><mi mathvariant=\\\"normal\\\">O</mi><mn>2</mn></msub><mfenced><mi mathvariant=\\\"normal\\\">g</mi></mfenced><mo>⇌</mo><mn>2</mn><msub><mi mathvariant=\\\"normal\\\">H</mi><mn>2</mn></msub><mi mathvariant=\\\"normal\\\">O</mi><mfenced><mi mathvariant=\\\"normal\\\">l</mi></mfenced></math></p>\\n\" +\n" +
        "        \"\\n\" +\n" +
        "        \"<p>The entire formula for the surface area of a cylinder is <math xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mn>2</mn><msup><mi>πr</mi><mn>2</mn></msup><mo>+</mo><mn>2</mn><mi>πrh</mi></math></p>"


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initWebView()
    }


    private fun initWebView() {

//        WebView.setWebContentsDebuggingEnabled(true)

        webView.ready {

            button.setOnClickListener {
                webView.setHtmlMathText(html)
            }

        }


    }


}