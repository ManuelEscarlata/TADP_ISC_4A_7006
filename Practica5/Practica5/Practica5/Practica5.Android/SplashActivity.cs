﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace Practica5.Droid
{
    [Activity(Label = "SplashActivity",Theme="@style/SplashTheme",MainLauncher =true,NoHistory =true,ConfigurationChanges =Android.Content.PM.ConfigChanges.ScreenSize)]
    public class SplashActivity : Activity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            StartActivity(new Intent(Application.Context,typeof(MainActivity)));
            // Create your application here
        }
    }
}