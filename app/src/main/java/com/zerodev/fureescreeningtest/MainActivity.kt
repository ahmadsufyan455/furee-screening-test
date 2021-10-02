package com.zerodev.fureescreeningtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val fontFamily = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .background(color = Color(0XFFF1F1F2))
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        HeaderMenu()
        ConsultantCard()
        PaymentDetailCard()
        PaymentMethod()
        ButtonPay()
    }
}

@Composable
fun HeaderMenu() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 24.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            border = BorderStroke(1.dp, color = Color.LightGray),
            shape = RoundedCornerShape(10.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.Menu,
                contentDescription = "Menu",
                modifier = Modifier.padding(8.dp)
            )
        }
        Text(
            text = "Appointment",
            fontSize = 18.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium
        )
        Card(
            border = BorderStroke(1.dp, color = Color.LightGray),
            shape = RoundedCornerShape(10.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = "Notification",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun ConsultantCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color(0XFF202D40)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.consultant),
                contentDescription = "Consultant",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(
                    text = "Dr. Corrie Anderson",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "Cardiovascular",
                    color = Color.Gray,
                    fontSize = 12.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Normal
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "01 hour consultation",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun PaymentDetailCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = 0.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Appointment Cost",
                    fontSize = 14.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "$95.00",
                    fontSize = 14.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Consultation fee for 01 hour",
                color = Color.Gray,
                fontSize = 12.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Admin Fee",
                    fontSize = 14.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "$05.00",
                    fontSize = 14.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "To Pay",
                    fontSize = 14.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "$100.00",
                    fontSize = 14.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Divider(color = Color.LightGray, thickness = 1.dp)
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(30.dp),
                border = BorderStroke(width = 1.dp, color = Color(0XFFEE845B)),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFFFEF9F6)),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp, horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.card),
                        contentDescription = "Promo Code",
                        tint = Color(0XFFEE845B)
                    )
                    Text(
                        text = "Use Promo Code",
                        fontSize = 14.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Medium
                    )
                    Icon(
                        imageVector = Icons.Rounded.KeyboardArrowRight,
                        contentDescription = "Arrow Next",
                        tint = Color(0XFFEE845B)
                    )
                }
            }
        }
    }
}

@Composable
fun PaymentMethod() {
    val selectedPayment = remember {
        mutableStateOf(Payment.paypal)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = 0.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Payment Options",
                fontSize = 14.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row {
                            RadioButton(
                                selected = selectedPayment.value == Payment.paypal,
                                onClick = {
                                    selectedPayment.value = Payment.paypal
                                },
                                colors = RadioButtonDefaults.colors(Color.DarkGray)
                            )
                            Text(
                                text = Payment.paypal,
                                modifier = Modifier.padding(start = 16.dp),
                                fontSize = 14.sp,
                                fontFamily = fontFamily,
                                fontWeight = FontWeight.Medium
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.paypal),
                            contentDescription = "Paypal",
                            modifier = Modifier.width(60.dp)
                        )
                    }
                    Divider(color = Color.LightGray, thickness = 1.dp)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row {
                            RadioButton(
                                selected = selectedPayment.value == Payment.creditCard,
                                onClick = {
                                    selectedPayment.value = Payment.creditCard
                                },
                                colors = RadioButtonDefaults.colors(Color.DarkGray),
                            )
                            Text(
                                text = Payment.creditCard,
                                modifier = Modifier.padding(start = 16.dp),
                                fontSize = 14.sp,
                                fontFamily = fontFamily,
                                fontWeight = FontWeight.Medium
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.visa),
                            contentDescription = "Visa",
                            modifier = Modifier.width(60.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ButtonPay() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFFEE845B)),
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 24.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Pay & Confirm",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp),
            fontSize = 14.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium
        )
    }
}

object Payment {
    const val paypal = "Paypal"
    const val creditCard = "Credit Card"
}