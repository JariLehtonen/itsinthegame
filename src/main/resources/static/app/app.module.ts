import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule }    from '@angular/http';
import { FormsModule }   from '@angular/forms';

import { AppComponent }   from './app.component';
import { PlayersComponent }   from './players/players.component';
import { TournamentsComponent }   from './tournaments/tournaments.component';
import { GamesComponent }   from './games/games.component';
import { ResultsComponent }   from './results/results.component';
import { BackendService }   from './backend/backend.service';

@NgModule({
  imports:      [ BrowserModule, FormsModule, HttpModule ],
  declarations: [ AppComponent, PlayersComponent, TournamentsComponent,GamesComponent,ResultsComponent ],
  providers:    [ BackendService ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
