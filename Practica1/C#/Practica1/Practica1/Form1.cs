using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica1
{
    public partial class Form1 : Form
    {
        int num1, num2;
        String operacion;
        String texto;
        int cont = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 1 ";
            if (cont == 1)
            {
                num1 = 1;
            }
            else
            {
                num2 = 1;
            }
            textBox2.Text = texto;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 2 ";
            if (cont == 1)
            {
                num1 = 2;
            }
            else
            {
                num2 = 2;
            }
            textBox2.Text = texto;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 3 ";
            if (cont == 1)
            {
                num1 = 3;
            }
            else
            {
                num2 = 3;
            }
            textBox2.Text = texto;
        }

        private void button_suma_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " + ";
            operacion = "+";
            textBox2.Text = texto;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 4 ";
            if (cont == 1)
            {
                num1 = 4;
            }
            else
            {
                num2 = 4;
            }
            textBox2.Text = texto;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 5 ";
            if (cont == 1)
            {
                num1 = 5;
            }
            else
            {
                num2 = 5;
            }
            textBox2.Text = texto;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 6 ";
            if (cont == 1)
            {
                num1 = 6;
            }
            else
            {
                num2 = 6;
            }
            textBox2.Text = texto;
        }

        private void button_resta_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " - ";
            operacion = "-";
            textBox2.Text = texto;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 7 ";
            if (cont == 1)
            {
                num1 = 7;
            }
            else
            {
                num2 = 7;
            }
            textBox2.Text = texto;
        }

        private void button8_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 8 ";
            if (cont == 1)
            {
                num1 = 8;
            }
            else
            {
                num2 = 8;
            }
            textBox2.Text = texto;
        }

        private void button9_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 9 ";
            if (cont == 1)
            {
                num1 = 9;
            }
            else
            {
                num2 = 9;
            }
            textBox2.Text = texto;
        }

        private void button_div_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " / ";
            operacion = "/";
            textBox2.Text = texto;
        }

        private void button0_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " 0 ";
            if (cont == 1)
            {
                num1 = 0;
            }
            else
            {
                num2 = 0;
            }
            textBox2.Text = texto;
        }

        private void button_mult_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " * ";
            operacion = "*";
            textBox2.Text = texto;
        }

        private void button_pont_Click(object sender, EventArgs e)
        {
            cont++;
            texto += " ^ ";
            operacion = "^";
            textBox2.Text = texto;
        }

        private void button_resul_Click(object sender, EventArgs e)
        {
            String res = "" + solucion(operacion, num1, num2);
            textBox2.Text = res;
        }

        public double solucion(String op, int numI, int numJ)
        {
            double resultado = 0;
            switch (op)
            {
                case "+":
                    resultado = numI + numJ;
                    break;
                case "*":
                    resultado = numI * numJ;
                    break;
                case "/":
                    if (num2 == 0)
                    {
                        resultado = -0;
                    }
                    else
                    {
                        resultado = numI / numJ;
                    }
                    break;
                case "-":
                    resultado = numI - numJ;
                    break;
                case "^":
                    resultado = Math.Pow(numI, numJ);
                    break;
                default:
                    break;
            }
            return resultado;
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_MouseClick(object sender, MouseEventArgs e)
        {
            textBox2.Text = "";
            textBox2.ForeColor = Color.Black;
            texto = "";
        }
    }
}
