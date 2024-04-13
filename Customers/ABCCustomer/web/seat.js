/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


const container=document.querySelector('.container');
const seats=document.querySelectorAll('.row.seat:not(.Occupied');
const count=document.getElementById('count');
const total=document.getElementById('total');
const movieSelect=document.getElementById('movie');

populateUI();

let ticketPrice=+movieSelect.value ;

//seave selected movie index and price
function setMovieData(movieIndex,moviePrice)
{
    localStorage.setItem('selectedMovieIndex',movieIndex);
    localStorage.setItem('selectedMoviePrice',moviePrice);
}

//update total and count
function updateSelectedCount(){
    const selectedSeats=document.querySelectorAll( '.row .seat.Selected');

    const seatsIndex=[...selectedSeats].map(function(seat){
        return [...seats].indexOf(seat);
    });

    localStorage.setItem('selectedseats',JSON.stringify(seatsIndex));

    
    const selectedSeatsCount=selectedSeats.length;

    count.innerText=selectedSeatsCount;
    total.innerText=selectedSeatsCount*ticketPrice;
}
//get data from localsstorage and populate the ui
function populateUI()
{
    const selectedSeats=JSON.parse(localStorage.getItem('selectedSets'));

    if(selectedSeats !== null && selectedSeats.length>0){
        seats.forEach((seat,index)=>{
            if(selectedSeats.indexOf(index)>-1){
                seat.classList.add('Selected');
            }
        });
    }
    const selectedMovieIndex=localStorage.getItem('selectedMovieIndex');

    if(selectedMovieIndex !=null){
        movieSelect.selectedIndex=selectedMovieIndex;
    }
}

//movie select event
movieSelect.addEventListener('change',(e)=> {
    ticketPrice=+e.target.value;
    setMovieData(e.target.selectedIndex,e.target.value);
    updateSelectedCount();
})


container.addEventListener('click',(e)=>{
    if(e.target.classList.contains('seat') && !e.target.classList.contains('Occupied')){
        e.target.classList.toggle('Selected');
    }
   
    updateSelectedCount();
});
updateSelectedCount();